package com.example.Poha.conti;

import com.example.Poha.model.Student_Model;
import com.example.Poha.servi.Student_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    Student_Service student_service;
    @RequestMapping(value = "/p",method = RequestMethod.POST)
    public String add(@RequestBody Student_Model student_model){
       return student_service.add(student_model);
    }
    @RequestMapping(value = "g",method = RequestMethod.GET)
    public List<Student_Model>obj(){
        return student_service.obj();
    }
@RequestMapping(value = "u",method = RequestMethod.PUT)
    public String update(@RequestParam String name,@RequestParam Long id){
       return student_service.update(name, id);
    }
    @RequestMapping(value = "d",method = RequestMethod.DELETE)
    public String deleted(Long index){
        return student_service.delete(index);
    }
}
