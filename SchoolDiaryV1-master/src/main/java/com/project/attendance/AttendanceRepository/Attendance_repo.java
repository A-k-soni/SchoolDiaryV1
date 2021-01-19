package com.project.attendance.AttendanceRepository;

import com.project.attendance.dto.Student_Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Attendance_repo extends JpaRepository<Student_Attendance , Integer> {

    @Query(value = "select * from student_att where student_class =?1",nativeQuery = true)
    public List<Student_Attendance> getAttendance(int cls);

    @Query(value = "select * from student_att where student_id =?1",nativeQuery = true)
    public List<Student_Attendance> getAttendance1(String clss);


}
