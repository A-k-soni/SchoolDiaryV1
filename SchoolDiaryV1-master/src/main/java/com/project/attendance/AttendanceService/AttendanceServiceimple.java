package com.project.attendance.AttendanceService;

import com.project.Student_details.dto.student_table;
import com.project.attendance.AttendanceRepository.Attendance_repo;
import com.project.attendance.dto.Student_Attendance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Service
public class AttendanceServiceimple implements  AttendanceService{


    @Autowired
    Attendance_repo ar;


    @Override
    public List<Student_Attendance> getAttendanceByCls(int cls) {

        Iterable<Student_Attendance> sA1;

        List<Student_Attendance> attendaceList;

        sA1=ar.getAttendance(cls);

        Iterator<Student_Attendance> itr =sA1.iterator();
        attendaceList=new ArrayList<Student_Attendance>();
        while(itr.hasNext()){
            attendaceList.add(itr.next()) ;
        }

        return  attendaceList;
    }

    @Override
    public List<Student_Attendance> getAttendanceById(String Student_Id) {
        Iterable<Student_Attendance> sA1;
        List<Student_Attendance> attendaceList;
        sA1=ar.getAttendance1(Student_Id);
        Iterator<Student_Attendance> itr =sA1.iterator();
        attendaceList=new ArrayList<Student_Attendance>();
        while(itr.hasNext()){
            attendaceList.add(itr.next()) ;
        }
        return  attendaceList;


    }

    @Override
    public void addAttendance(List<Student_Attendance> sa)
    {
        ar.saveAll(sa);
    }
}
