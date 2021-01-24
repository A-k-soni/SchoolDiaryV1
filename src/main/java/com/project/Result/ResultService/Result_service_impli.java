package com.project.Result.ResultService;

import com.project.Result.ResultRepository.ResultRepo;
import com.project.Result.dto.Result_Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class Result_service_impli implements result_service {


    @Autowired
    private ResultRepo rp;

    @Override
    public void updateResult(List<Result_Table> rt) {

        List<Result_Table> list = new ArrayList<>(rt);
       for(int i=0;i<list.size();i++){
           list.get(i).setCompid(list.get(i).getStudent_id()+list.get(i).getExam_date());
       }
        rp.saveAll(list);
    }

    @Override
    public List<Result_Table> getResult(String uid) {
        Iterable<Result_Table> itr;
        itr=rp.getRes(uid);
        List<Result_Table> resultList = new ArrayList<>();
        Iterator<Result_Table> it = itr.iterator();
        while(it.hasNext()){
            resultList.add(it.next());
        }
        return  resultList;
    }

    @Override
    public List<Result_Table> getAlreadyAppliedExams(int cls) {
        System.out.println(cls);
        Iterable<Result_Table> itr;
        itr=rp.getAlreadyAppliedExams(cls);
        List<Result_Table> resultList = new ArrayList<>();
        Iterator<Result_Table> it = itr.iterator();
        while(it.hasNext()){
            resultList.add(it.next());
        }


        List<Result_Table> resultList1 = new ArrayList<>();
        HashMap<String,String> map=new HashMap<String,String>();
        for(int i=0 ; i<resultList.toArray().length;i++ ){
            map.put(resultList.get(i).getExam_date(),resultList.get(i).getSubject());
        }


        for(Map.Entry m : map.entrySet()){
            Result_Table alreadtRt = new Result_Table();
            String  date= (String) m.getKey();
            String subect = (String)m.getValue();
            alreadtRt.setSubject(subect);
            alreadtRt.setExam_date(date);
            resultList1.add(alreadtRt);


        }

        return  resultList1;
    }


}
