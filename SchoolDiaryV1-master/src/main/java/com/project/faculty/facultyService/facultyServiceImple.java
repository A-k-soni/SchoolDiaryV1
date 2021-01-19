package com.project.faculty.facultyService;

import com.project.UserData_Login.dto.USerDataComplete;
import com.project.UserData_Login.dto.UserData;
import com.project.faculty.dto.faculty;
import com.project.faculty.repository.facultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Year;
import java.util.Optional;
@Service
public class facultyServiceImple implements  facultyService{


    @Autowired
    facultyRepository fr;


    @Override
    public void addFacultySepr(USerDataComplete udc) {

    }

    @Override
    public faculty getClass(String id) {

    return fr.fetchClass(id);

    }

    @Override
    public void addFaculty(faculty f) {
        fr.save(f);
    }
}
