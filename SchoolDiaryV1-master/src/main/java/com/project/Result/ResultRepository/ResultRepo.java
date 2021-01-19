package com.project.Result.ResultRepository;

import com.project.Result.dto.Result_Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ResultRepo extends JpaRepository<Result_Table ,Integer> {

        @Query(value ="select * from result_table where student_id =?1",nativeQuery = true)
        public List<Result_Table> getRes(String uid);

}
