package com.project.Notice.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Notice.dto.Notice_Table;
import com.project.Notice.repository.NoticeRepository;



@Service
public class NoticeServiceImple implements NoticeService{
    @Autowired
    private NoticeRepository repository;

    public List<Notice_Table> GlobalNotice(String ToDate) {
        List<Notice_Table> list = new ArrayList<Notice_Table>();

        list = repository.findAll();
        List<Notice_Table> list2 = new ArrayList<>();
        for (Notice_Table notice : list) {


            StringBuilder input1d = new StringBuilder();
            StringBuilder input2q = new StringBuilder();
            input1d.append(notice.getDate_to());
            input2q.append(ToDate);
            long dbdate = Integer.parseInt(input1d.reverse().toString());
            long qdate = Integer.parseInt(input2q.reverse().toString());
            System.out.println(dbdate-qdate+ " "+ "sum");
            System.out.println(dbdate+" " +qdate+ " "+ "");
            if(dbdate-qdate >=0)
                list2.add(notice);
        }

        return list2;
    }

    public List<Notice_Table> ClassNotice(int student_class,String ToDate) {
        List<Notice_Table> list = new ArrayList<Notice_Table>();

        list = repository.ClassNotice(student_class);
        List<Notice_Table> list2 = new ArrayList<Notice_Table>();
        for (Notice_Table notice : list) {

            StringBuilder input1d = new StringBuilder();
            StringBuilder input2q = new StringBuilder();
            input1d.append(notice.getDate_to());
            input2q.append(ToDate);
            long dbdate = Integer.parseInt(input1d.reverse().toString());
            long qdate = Integer.parseInt(input2q.reverse().toString());
            System.out.println(dbdate-qdate+ " "+ "sum");
            System.out.println(dbdate+" " +qdate+ " "+ "");
            if(dbdate-qdate >=0)
                list2.add(notice);
        }

        return list2;
    }

    @Override
    public void addNotice(Notice_Table nt) {
        repository.save(nt);
    }

    public List<Notice_Table> AllNotice() {
        List<Notice_Table> list = new ArrayList<Notice_Table>();
        list = repository.findAll();
        return list;
    }

}
