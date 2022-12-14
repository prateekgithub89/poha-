package com.example.Poha.conti;

import com.example.Poha.model.MyListOnUiModel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class MyListOnUiController {

    ArrayList<MyListOnUiModel>obj = new ArrayList<>();
    @RequestMapping("/wq")
    public String add() {
        MyListOnUiModel obj1 = new MyListOnUiModel("kl", 89, "ui", "lalali");
        MyListOnUiModel obj2 = new MyListOnUiModel("kl", 89, "ui", "lalali");
        MyListOnUiModel obj3 = new MyListOnUiModel("kl", 89, "ui", "lalali");
        MyListOnUiModel obj4 = new MyListOnUiModel("kl", 89, "ui", "lalali");

        obj.add(obj1);
        obj.add(obj2);
        obj.add(obj3);
        obj.add(obj4);
        return "Sucessfully hoi gava";
    }
        @RequestMapping("/b")
        public List<MyListOnUiModel>obje(){
            return obj;
        }
        @RequestMapping("/us")
        public String update(@RequestParam String name ){
        obj.get(0).setName(name);
    return "hui gava sahi";
    }
    @RequestMapping("/df/{index}")
    public String delete(@PathVariable int index){
        obj.remove(index);
        return "deleted";
    }

    }






































//    ArrayList<MyListOnUiModel>obj = new ArrayList<>();
//    @RequestMapping("/al")
//    public String add(){
//        MyListOnUiModel obj1 = new MyListOnUiModel("jallaludee",88,"lla","be a king");
//        MyListOnUiModel obj2 = new MyListOnUiModel("jallaludee",88,"lla","be a king");
//        MyListOnUiModel obj3 = new MyListOnUiModel("jallaludee",88,"lla","be a king");
//        MyListOnUiModel obj4 = new MyListOnUiModel("jallaludee",88,"lla","be a king");
//
//        obj.add(obj1);
//        obj.add(obj2);
//        obj.add(obj3);
//        obj.add(obj4);
//
//        return " yeah my list is on ui";
//    }
//    @RequestMapping("/list")
//    public List<MyListOnUiModel>obje(){
//        return obj;
//    }
//    @RequestMapping("/sahina")
//    public String update(@RequestParam String name){
//        obj.get(0).setName(name);
//        return "sahi ho gya";
//    }
//    @RequestMapping("/delete/{index}")
//    public String delete(@PathVariable int index){
//        obj.remove(index);
//        return "Khatam tata Bye Bye";
//    }
//}
//    @RequestMapping("/ddd/{index}")
//    public String delete(@PathVariable int index){
//        obj.remove(index);
//        return "Sucessfully deleted";



