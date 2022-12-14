package com.example.Poha.servi;

import com.example.Poha.model.Employee_Model;
import com.example.Poha.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo repo;
    public String addEmployee(Employee_Model employee_model) {

        repo.save(employee_model);// it will insert data into datbase
        return "Sucessfully added ";
    }
    public List<Employee_Model> obj(){
         return  repo.findAll(); // fetch all record from db
    }

    public String updateEmployee(String name,Long id ){
        // step1 : Get record from db
        //step2: change data and save again to db
     Employee_Model  employee_model = repo.getById(id); // find record from db
        employee_model.setName(name);
        repo.save(employee_model);
        return "Sucessfully updated as name as "+name;

    }

    public String delete ( Long index){
        repo.deleteById(index);  // delete from db
        return "Sucessfully deleted";
    }


}
