package com.example.Poha.servi;

import com.example.Poha.model.Panner_model;
import com.example.Poha.repo.Panner_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Paneer_service {
    @Autowired
    Panner_repo panner_repo;
    public String add(Panner_model panner_model){
        panner_repo.save(panner_model);
        return "panner added suceesfully";
    }
}
