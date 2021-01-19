package com.project.Notice.service;

import com.project.Notice.dto.Notice_Table;
import org.springframework.stereotype.Service;

import java.util.List;


public interface NoticeService {

    public List<Notice_Table> GlobalNotice(String ToDate);
    public List<Notice_Table> ClassNotice(int student_class, String ToDate);
    public void addNotice(Notice_Table nt);
    public List<Notice_Table> AllNotice();
}
