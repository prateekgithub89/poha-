package com.example.Poha.servi;

import com.example.Poha.model.Student_Model;
import com.example.Poha.repo.Student_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Student_Service {

    @Autowired
    Student_Repo student_repo;

    public String add(Student_Model student_model){
        student_repo.save(student_model);
        return "Sucessfully added to database";
    }

    public List<Student_Model>obj() {
        return student_repo.findAll();
    }

    public String update(String name,Long id){
      Student_Model student_model=  student_repo.getById(id);
      student_model.setName(name);
      student_repo.save(student_model);
      return "Sucessfully up";
    }

    public String delete(Long id){
        student_repo.deleteById(id);
        return "Sucessfully del";
    }


}
