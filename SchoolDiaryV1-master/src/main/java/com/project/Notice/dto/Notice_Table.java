package com.project.Notice.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Notice_Table {


    @Id
    @GeneratedValue
    int notice_id;
    @Column(nullable = false)
    String msg;
    int student_class;
    @Column(nullable = false)
    String date_from;
    @Column(nullable = false)
    String date_to;

    public int getNotice_id() {
        return notice_id;
    }

    public void setNotice_id(int notice_id) {
        this.notice_id = notice_id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getStudent_class() {
        return student_class;
    }

    public void setStudent_class(int student_class) {
        this.student_class = student_class;
    }

    public String getDate_from() {
        return date_from;
    }

    public void setDate_from(String date_from) {
        this.date_from = date_from;
    }

    public String getDate_to() {
        return date_to;
    }

    public void setDate_to(String date_to) {
        this.date_to = date_to;
    }

    @Override
    public String toString() {
        return "Notice_Table{" +
                "notice_id=" + notice_id +
                ", msg='" + msg + '\'' +
                ", student_class=" + student_class +
                ", date_from='" + date_from + '\'' +
                ", date_to='" + date_to + '\'' +
                '}';
    }
}
