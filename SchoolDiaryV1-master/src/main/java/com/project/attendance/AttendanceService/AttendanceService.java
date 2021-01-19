package com.project.attendance.AttendanceService;

import com.project.attendance.dto.Student_Attendance;

import java.util.List;

public interface AttendanceService {

    public List<Student_Attendance> getAttendanceByCls(int cls);
    public List<Student_Attendance> getAttendanceById(String Student_Id);
    public void addAttendance(List<Student_Attendance> sa);
}
