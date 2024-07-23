package com.example.day1springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class welcomeController {



    @GetMapping("/name")
    public String name() {
        return "My name is Suliman";
    }

    @GetMapping("/age")
    public String age() {
        return "My age is 23";
    }

    @GetMapping("/check/status")
    public String check() {
        return "Everything OK";
    }

    @GetMapping("/health")
    public String health() {
        return "Server health is up and running";
    }

    @GetMapping("/names")
    public ArrayList<String> names() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Suliman");
        names.add("Khalid");
        return names ;
    }






}
