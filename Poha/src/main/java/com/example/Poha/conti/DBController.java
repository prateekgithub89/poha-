package com.example.Poha.conti;

import com.example.Poha.model.Employee_Model;
import com.example.Poha.servi.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class DBController {

    @Autowired
    EmployeeService Service;

@RequestMapping(value ="/add",method =RequestMethod.POST)
public String addEmployee(@RequestBody Employee_Model employee_model){

return Service.addEmployee(employee_model);
}
@RequestMapping(value="/lp",method = RequestMethod.GET)
public List<Employee_Model> getEmployeeArrayList(){

   return Service.obj();
}

@RequestMapping(value ="/upda",method = RequestMethod.PUT)
public String update(@RequestParam String name,@RequestParam Long id){

    return Service.updateEmployee(name,id);
}

@RequestMapping(value ="delete/{index}",method = RequestMethod.DELETE)
public String delete (@PathVariable Long index){
Service.delete(index);
    return "Sucessfully deleted";
}

}
