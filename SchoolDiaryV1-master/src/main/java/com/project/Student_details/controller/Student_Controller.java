package com.project.Student_details.controller;

import com.project.Student_details.StudentsService.StudentService;
import com.project.Student_details.dto.student_table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class Student_Controller {

    @Autowired
    private StudentService sserService;


        @GetMapping(value = "student_List/{s_class}")
        public List<student_table> studentList(@PathVariable int s_class){
            List<student_table> students;
            students =sserService.getAll(s_class);
            return students;
        }


        @PostMapping(value = "insertDetails")
        public void insert(@RequestBody student_table st){
            sserService.addDetails(st);
        }


        @GetMapping(value="getStudent/{pId}")
        public List<student_table> studentList(@PathVariable String pId){
            List<student_table> students;
            students =sserService.getStudentForParent(pId);
            return students;
        }


    @GetMapping(value="getStudentclass/{pId}")
    public int studentclass(@PathVariable String pId){
       int student_class ;
        student_class =sserService.getStudentclass(pId);
        return student_class;
    }


}
