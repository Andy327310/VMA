package com.example.crud;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {

    @Autowired
    Repository repo;


    @RequestMapping("")
    public String indexPage(){

        return "index";
    }

    @GetMapping("/saveData")
    @ResponseBody
    public String saveData(Karta userData) {
        repo.save(userData);
        return "Karta pridaná !";
    }

}
