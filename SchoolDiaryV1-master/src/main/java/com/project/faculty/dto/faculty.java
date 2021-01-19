package com.project.faculty.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class faculty {

    @Id
    String user_id_faculty;
    int teaching_class;
    String joining_date;
    String dob;
    String gender;

    public String getUser_id_faculty() {
        return user_id_faculty;
    }

    @Override
    public String toString() {
        return "faculty{" +
                "user_id_faculty='" + user_id_faculty + '\'' +
                ", teaching_class=" + teaching_class +
                ", joining_date='" + joining_date + '\'' +
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public void setUser_id_faculty(String user_id_faculty) {
        this.user_id_faculty = user_id_faculty;
    }

    public int getTeaching_class() {
        return teaching_class;
    }

    public void setTeaching_class(int teaching_class) {
        this.teaching_class = teaching_class;
    }

    public String getJoining_date() {
        return joining_date;
    }

    public void setJoining_date(String joining_date) {
        this.joining_date = joining_date;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
