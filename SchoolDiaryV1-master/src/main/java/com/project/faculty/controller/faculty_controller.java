package com.project.faculty.controller;

import com.project.faculty.dto.faculty;
import com.project.faculty.facultyService.facultyServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class faculty_controller {

    @Autowired
    private facultyServiceImple fsi;

    @GetMapping(value = "get_class/{id}")
    public faculty getcls(@PathVariable String id){
        System.out.println(id);
        faculty fd =new faculty();
       fd=fsi.getClass(id);
        System.out.println(fd);
        return  fd;
    }



}
