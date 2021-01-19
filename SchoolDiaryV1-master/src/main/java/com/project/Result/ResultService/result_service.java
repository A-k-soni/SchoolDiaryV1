package com.project.Result.ResultService;

import com.project.Result.dto.Result_Table;

import java.util.List;

public interface result_service {

    public void updateResult(List<Result_Table> rt);

    public List<Result_Table> getResult(String uid);


}
