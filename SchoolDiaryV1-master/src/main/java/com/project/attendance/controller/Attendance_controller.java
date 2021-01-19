package com.project.attendance.controller;


import com.project.attendance.AttendanceService.AttendanceService;
import com.project.attendance.dto.Student_Attendance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class Attendance_controller {

    @Autowired
    private AttendanceService ss;

    @GetMapping(value = "get_attendance/{cls}")
    public List<Student_Attendance> ss(@PathVariable int cls){

        List<Student_Attendance> sa;
        sa=ss.getAttendanceByCls(cls);
        return sa;
    }

    @PostMapping(value = "submit_Attendance")
    public void submit(@RequestBody List<Student_Attendance> sa){
         ss.addAttendance(sa);
    }

    @GetMapping(value = "get_attendanceId/{uid}")
    public List<Student_Attendance> ss1(@PathVariable String uid){
        List<Student_Attendance> sa;
        sa=ss.getAttendanceById(uid);
        return sa;
    }


}
