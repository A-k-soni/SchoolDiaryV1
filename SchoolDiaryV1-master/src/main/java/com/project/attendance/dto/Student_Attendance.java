package com.project.attendance.dto;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "student_att")
public class Student_Attendance implements Serializable {

    @Id
    String compid;
    @Column(nullable = false)
    String att_date;
    @Column(nullable = false)
    String student_id;
    @Column(nullable = false)
    int student_class;
    @Column(nullable = false)
    int present;
    @Column(nullable = false)
    int studentleave;

    public String getCompid() {
        return compid;
    }

    public void setCompid(String compid) {
        this.compid = compid;
    }

    public String getAtt_date() {
        return att_date;
    }

    public void setAtt_date(String att_date) {
        this.att_date = att_date;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public int getStudent_class() {
        return student_class;
    }

    public void setStudent_class(int student_class) {
        this.student_class = student_class;
    }

    public int getPresent() {
        return present;
    }

    public void setPresent(int present) {
        this.present = present;
    }

    public int getStudentleave() {
        return studentleave;
    }

    public void setStudentleave(int studentleave) {
        this.studentleave = studentleave;
    }

    @Override
    public String toString() {
        return "Student_Attendance{" +
                "compid='" + compid + '\'' +
                ", att_date='" + att_date + '\'' +
                ", student_id='" + student_id + '\'' +
                ", student_class=" + student_class +
                ", present=" + present +
                ", studentleave=" + studentleave +
                '}';
    }
}
