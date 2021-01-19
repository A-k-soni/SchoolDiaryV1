package com.project.Result.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Result_Table {

    @Id
    String compid;
    String student_id;
    int Student_class;
    String subject;
    int max_marks;
    int obt_marks;
    String exam_date;

    public String getCompid() {
        return compid;
    }

    public void setCompid(String compid) {
        this.compid = compid;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public int getStudent_class() {
        return Student_class;
    }

    public void setStudent_class(int student_class) {
        Student_class = student_class;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getMax_marks() {
        return max_marks;
    }

    public void setMax_marks(int max_marks) {
        this.max_marks = max_marks;
    }

    public int getObt_marks() {
        return obt_marks;
    }

    public void setObt_marks(int obt_marks) {
        this.obt_marks = obt_marks;
    }

    public String getExam_date() {
        return exam_date;
    }

    public void setExam_date(String exam_date) {
        this.exam_date = exam_date;
    }

    @Override
    public String toString() {
        return "Result_Table{" +
                "compid='" + compid + '\'' +
                ", student_id='" + student_id + '\'' +
                ", Student_class=" + Student_class +
                ", subject='" + subject + '\'' +
                ", max_marks=" + max_marks +
                ", obt_marks=" + obt_marks +
                ", exam_date='" + exam_date + '\'' +
                '}';
    }
}
