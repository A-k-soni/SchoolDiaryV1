package com.project.UserData_Login.userService;

import com.project.MailFeature;
import com.project.Student_details.StudentsService.StudentService;
import com.project.Student_details.dto.student_table;
import com.project.UserData_Login.dto.USerDataComplete;
import com.project.UserData_Login.dto.UserData;
import com.project.UserData_Login.repository.userRepository;
import com.project.faculty.dto.faculty;
import com.project.faculty.facultyService.facultyService;
import org.jooq.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import java.time.Year;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Service
public class userServiceImple implements  userService{


    @Autowired
    private MailFeature mail;
    @Autowired
    userRepository ur;
    @Autowired
    private StudentService sr;
    @Autowired
    private facultyService fs;
    int flag=0;
    @Override
    public UserData addUserSep(USerDataComplete udc) throws MessagingException {
        UserData r =new UserData();
        System.out.println(udc);
        UserData ud1 = new UserData();
        UserData ud2 = new UserData();
        ud1.setfName(udc.getfName());
        ud1.setlName(udc.getlName());
        ud1.setAddress(udc.getAddress());
        ud1.setCity(udc.getCity());
        ud1.setEmail_id(udc.getEmail_id());
        ud1.setMobile_no(udc.getMobile_no());
        ud1.setRole_id(udc.getRole_id());
        ud1.setState(udc.getState());
        ud1.setCountry(udc.getCountry());
        ud1.setDob(udc.getDob());
        ud1.setGender(udc.getGender());
        String id = String.valueOf(udc.getRole_id());
        int year = Year.now().getValue();
        String y = String.valueOf(year);
        String UiD = (id+udc.getMobile_no());
        String HUID = String.valueOf(UiD.hashCode());
        ud1.setUserId(y+"-"+HUID);
        String pass = String.valueOf(udc.getPassword().hashCode());
        ud1.setPassword(pass);
        ud1.setSecurity_q_id(udc.getSecurityQuestionId_S());
        ud1.setSecurity_q_A(udc.getsQanswer_S());
    //================ForParentAsUSer=====================
        if(udc.getRole_id() == 2) {
            ud2.setfName(udc.getfName_f());
            ud2.setlName(udc.getlName_f());
            ud2.setAddress(udc.getAddress());
            ud2.setCity(udc.getCity());
            ud2.setEmail_id(udc.getEmail_id_f());
            ud2.setMobile_no(udc.getMobile_no_f());
            ud2.setRole_id(udc.getRole_id() + 1);
            ud2.setState(udc.getState());
            ud2.setCountry(udc.getCountry());
            String pass_f = String.valueOf(udc.getMobile_no_f().hashCode());
            ud2.setPassword(pass_f);
            //======update UI and update  this part===
            ud2.setSecurity_q_id(udc.getSecurityQuestionId_F());
            ud2.setSecurity_q_A(udc.getsQanswer_F());
            //ud2.setSecurity_q_id(udc.getSecurityQuestionId_S());
           // ud2.setSecurity_q_A(udc.getsQanswer_S());
            int userIdf = 0;
            if (udc.getRole_id() == 2) {
                userIdf = 3;
            }
            String s1 = String.valueOf(userIdf);
            String iD_F = s1 + udc.getMobile_no_f();
            String HUID_F = String.valueOf(iD_F.hashCode());
            ud2.setUserId(y + "-" + HUID_F);
        }


        ud1.setIsApproved(udc.getIsApproved());
        List<UserData> li = new ArrayList<>();
        Iterable<UserData> it = ur.findAll();
        Iterator<UserData> itr =it.iterator();
        while(itr.hasNext()){
            li.add(itr.next());
        }
        for(int i=0;i<li.size();i++){
            if(li.get(i).getEmail_id().equals(ud1.getEmail_id()) || li.get(i).getMobile_no().equals(ud1.getMobile_no())){
                System.out.println(li.get(i).getMobile_no());
                flag++;
            }
        }
        if(flag!=0){
            System.out.println("flag >1");
            flag =0;
            return null;
        }else{
            flag=0;
            System.out.println("falg=0");
            r=addUser(ud1);

            mail.send(ud1.getEmail_id(),"School E Diary" , "Registration Successful");
            System.out.println("ud1");
                if (ud2.getfName() == null) {
            } else {
              r= addUser(ud2);
             System.out.println("ud2");
            }
            System.out.println(" *** "+udc.getStudent_class());
            if(udc.getStudent_class()!= 0){
                student_table st= new student_table();
                st.setUser_id_parent(ud2.getUserId());
                st.setUser_id_student(ud1.getUserId());
                st.setfName(ud1.getfName());
                st.setlName(ud1.getlName());
                st.setGender(udc.getGender());
                st.setDOB(udc.getDob());
                st.setStudent_class(udc.getStudent_class());
                sr.addDetails(st);
            }
            if(udc.getFaculty_class()!=0){
                System.out.println("hello");
                faculty f= new faculty();
                f.setDob(udc.getDob());
                f.setGender(udc.getGender());
                f.setUser_id_faculty(ud1.getUserId());
                f.setJoining_date(udc.getJoining_date());
                f.setTeaching_class(udc.getFaculty_class());
                fs.addFaculty(f);
            }
        }
        return r;
    }

    @Override
    public UserData addUser(UserData user) {
        System.out.println(flag);
    return  ur.save(user);
    }

    @Override
    public void removeUser(int id) {

    }

    @Override
    public UserData getUser(String id) {
        return ur.findByuserId(id);
    }

    @Override
    public void modifyUser(UserData user) {

    }

    @Override
    public List<UserData> getAll() {

       return ur.findAll();
    }

    @Override
    public UserData UserLogin(UserData user){

        String pass = String.valueOf(user.getPassword().hashCode());
        user.setPassword(pass);
        if(user.getEmail_id()!=null) {
        user=ur.loginE(user.getEmail_id(), user.getPassword());
        return user;
    }else if(user.getMobile_no()!=null){
        user=ur.loginM(user.getMobile_no(),user.getPassword());
        return user;
        }
        return null;
    }

    @Override
    public void aprove(List<UserData> ud) {
        ur.saveAll(ud);
    }

    @Override
    public int forget(UserData userdata) {

        String pass = String.valueOf(userdata.getPassword().hashCode());
        System.out.println(pass+" "+userdata.getEmail_id()+" "+userdata.getMobile_no()+" "+userdata.getSecurity_q_id()+" "+userdata.getSecurity_q_A());
        return ur.updatePassword(pass,userdata.getEmail_id(),userdata.getMobile_no(),userdata.getSecurity_q_id(),userdata.getSecurity_q_A());
    }
}
