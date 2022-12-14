package com.example.Poha.conti;

import com.example.Poha.model.Employee_Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeController {

    ArrayList<Employee_Model>employee_models = new ArrayList<>();


    @RequestMapping("/add")
    public String addemployee(){
        Employee_Model employee = new Employee_Model("raj",4500000,"it");
        employee_models.add(employee);
return "Sucessfully added emplyee";

    }
    @RequestMapping("/get")
    public ArrayList<Employee_Model>getEmployee_models(){
        return employee_models;
    }

    @RequestMapping("/update")
    public String update(@RequestParam String name){
        employee_models.get(0).setName(name);
        return "Sucessfully updated name as "+name;
    }
@RequestMapping("/delete/{index}")
    public String delete(@PathVariable int index){
        employee_models.remove(index);
        return "Sucessfully deleted";
    }





}
