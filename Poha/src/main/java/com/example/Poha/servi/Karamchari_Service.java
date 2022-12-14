package com.example.Poha.servi;

import com.example.Poha.model.Karamchari_model;
import com.example.Poha.repo.Karamchari_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Service
public class Karamchari_Service {

    @Autowired
    Karamchari_repo karamchari_repo;

    public String add(Karamchari_model karamchari_model){
        karamchari_repo.save(karamchari_model);
        return "Successfully ad";
    }

    public List<Karamchari_model>obj(){
      return   karamchari_repo.findAll();
    }

    public String update(String name,Long id){
    Karamchari_model karamchari_model=    karamchari_repo.getById(id);
    karamchari_model.setName(name);
    return "Hogya update";
    }
public String delete(long index){
        karamchari_repo.deleteById( index);
        return "Sucessfully deleted";
}

}
