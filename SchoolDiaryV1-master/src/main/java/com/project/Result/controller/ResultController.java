package com.project.Result.controller;
import com.project.Result.ResultService.result_service;
import com.project.Result.dto.Result_Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ResultController {
    @Autowired
    private result_service rs;
    @PostMapping(value = "updateResult")
    public void submitResult(@RequestBody List<Result_Table> rt){
        rs.updateResult(rt);
    }
    @GetMapping(value = "getResult/{uid}")
    public List<Result_Table> getRes(@PathVariable String uid){
        return rs.getResult(uid);
    }
}
