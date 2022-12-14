package com.example.Poha.conti;

import com.example.Poha.model.Karamchari_model;
import com.example.Poha.servi.Karamchari_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Karamchari_Controller {
    @Autowired
    Karamchari_Service karamchari_service;
    @RequestMapping(value = "/hg",method = RequestMethod.POST)
    public String add(Karamchari_model karamchari_model){
  return karamchari_service.add(karamchari_model);
    }
    @RequestMapping(value = "/ag",method = RequestMethod.GET)
    public List<Karamchari_model>obj(){
        return karamchari_service.obj();
    }
@RequestMapping(value = "/sahi",method = RequestMethod.PUT)
public String update(@RequestParam String name ,@RequestParam Long id){
       return karamchari_service.update(name, id);
}
    @RequestMapping(value = "/mit",method = RequestMethod.DELETE)
    public String deleted(Long name){
      return   karamchari_service.delete(name);
    }

}
