package com.example.Poha.conti;

import com.example.Poha.model.Maid_Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Maid_Controller {

    ArrayList<Maid_Model>obj = new ArrayList<>();
    @RequestMapping("/sw")
    public String add(){
        Maid_Model maid1 = new Maid_Model("munni",44,"shalimar");
        Maid_Model maid2 = new Maid_Model("munni",44,"shalimar");
        Maid_Model maid3 = new Maid_Model("munni",44,"shalimar");

        obj.add(maid1);
        obj.add(maid2);
        obj.add(maid3);

        return "Sucessfully added to ui";
    }
    @RequestMapping("/sa")
    public List<Maid_Model>obj (){
        return obj;
    }




}
