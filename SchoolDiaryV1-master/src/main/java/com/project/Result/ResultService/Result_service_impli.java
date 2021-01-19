package com.project.Result.ResultService;

import com.project.Result.ResultRepository.ResultRepo;
import com.project.Result.dto.Result_Table;
import com.project.Student_details.dto.student_table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Access;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class Result_service_impli implements result_service {


    @Autowired
    private ResultRepo rp;

    @Override
    public void updateResult(List<Result_Table> rt) {
        rp.saveAll(rt);
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
}
