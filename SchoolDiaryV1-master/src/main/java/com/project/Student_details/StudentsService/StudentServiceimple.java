package com.project.Student_details.StudentsService;

import com.project.Student_details.dto.student_table;
import com.project.Student_details.repository.StudentRepository;
import com.project.UserData_Login.dto.USerDataComplete;
import com.project.UserData_Login.dto.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Year;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Service
public class StudentServiceimple implements StudentService {

    @Autowired
    private  StudentRepository sr;

    @Override
    public void addDetailsSepr(USerDataComplete udc) {

    }

    public int getStudentclass(String id){
        int cls;
        student_table st;
        st= sr.findByuser_id_student(id);
        cls=st.getStudent_class();
        return cls;

    }

    @Override
    public List<student_table> getAll(int s_class) {

            Iterable<student_table> s1;

            List<student_table> students;

            s1=sr.getStudentsByClass(s_class);

        Iterator<student_table> itr =s1.iterator();
        students=new ArrayList<student_table>();
        while(itr.hasNext()){
            students.add(itr.next()) ;
        }

        return  students;
    }

    @Override
    public void addDetails(student_table st) {
        sr.save(st);
    }

    @Override
    public List<student_table> getStudentForParent(String pId) {
        Iterable<student_table> s1;

        List<student_table> students;

        s1=sr.getStudentsByPid(pId);

        Iterator<student_table> itr =s1.iterator();
        students=new ArrayList<student_table>();
        while(itr.hasNext()){
            students.add(itr.next()) ;
        }

        return  students;
    }
}
