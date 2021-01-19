package com.project.faculty.facultyService;

import com.project.UserData_Login.dto.USerDataComplete;
import com.project.faculty.dto.faculty;

public interface facultyService {

    public void addFacultySepr(USerDataComplete udc);
    public faculty getClass(String user_id_faculty);
    public void addFaculty(faculty f);
}
