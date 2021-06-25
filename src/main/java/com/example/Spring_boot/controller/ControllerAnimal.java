package com.example.Spring_boot.controller;

import com.example.Spring_boot.modal.Animal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ControllerAnimal {


    @RequestMapping("/animal")
    public Animal name(){
        Animal animal =new Animal("dog",2,"brown");
        return animal;
    }
    @RequestMapping("/ani_list")
    public List<Animal> get_list(){
        List<Animal>list=new ArrayList<>();
        Animal animal =new Animal("dog",2,"brown");
        list.add(animal);
        return list;
    }
}
