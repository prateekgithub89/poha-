package com.example.Poha.conti;

import com.example.Poha.model.Panner_model;
import com.example.Poha.servi.Paneer_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Panner_contoller {
    @Autowired
    Paneer_service paneer_service;
    @RequestMapping(value = "/al",method = RequestMethod.POST)
    public String add(@RequestBody Panner_model panner_model){
        return paneer_service.add(panner_model);

    }
}
