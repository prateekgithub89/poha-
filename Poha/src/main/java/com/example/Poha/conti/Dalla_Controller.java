package com.example.Poha.conti;

import com.example.Poha.model.Dalla_model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Dalla_Controller {

    ArrayList<Dalla_model> arrayList = new ArrayList<>();
    @RequestMapping(value = "/fg")
    public String addition(){
        Dalla_model phela1 = new Dalla_model("ramesh",78,"jadhav");
        Dalla_model phela2 = new Dalla_model("lorav",78,"jadhav");
        Dalla_model phela3 = new Dalla_model("picasso",78,"jadhav");
        Dalla_model phela4 = new Dalla_model("lavender",78,"jadhav");
        Dalla_model phela5 = new Dalla_model("mogra",78,"jadhav");

        arrayList.add(phela1);
        arrayList.add(phela2);
        arrayList.add(phela3);
        arrayList.add(phela4);
        arrayList.add(phela5);

        return "Sucessfully add ho gya hai";
    }
    @RequestMapping("/fc")
    public List<Dalla_model>obj(){
        return arrayList;
    }
    @RequestMapping("/o")
    public String update(@RequestParam String name){
        arrayList.get(0).setName(name);
        return "Sucess = Updated";
    }
    @RequestMapping("/d/{index}")
    public String delete(@PathVariable int index){
        arrayList.remove(0);
        return "Sucessfully deleted";

    }


}
