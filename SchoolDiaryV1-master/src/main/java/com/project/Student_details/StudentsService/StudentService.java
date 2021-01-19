package com.project.Student_details.StudentsService;

import com.project.Student_details.dto.student_table;
import com.project.UserData_Login.dto.USerDataComplete;

import java.util.List;

public interface StudentService {

    public  void addDetailsSepr(USerDataComplete udc);
    public List<student_table> getAll(int s_class);
    public void addDetails(student_table st);
    public List<student_table> getStudentForParent(String pId);
    public int getStudentclass(String id);
}
