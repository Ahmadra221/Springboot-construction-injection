package com.ahmad.spring.constructioninjectiondemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeveloperController {

    private  Developer springDeveloper;

    @Autowired
    //define a constructor for dependency injection
    public DeveloperController(Developer springDeveloper) {
        this.springDeveloper = springDeveloper;
    }

    @GetMapping("/getdeveloper")
    public  String getDeveloperName(){
        return  springDeveloper.getDeveloperName();
    }
}
