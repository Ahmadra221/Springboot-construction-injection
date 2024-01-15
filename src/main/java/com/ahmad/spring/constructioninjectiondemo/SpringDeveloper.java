package com.ahmad.spring.constructioninjectiondemo;


import org.springframework.stereotype.Component;

@Component
//makes the class a spring bean and makes it available for dependency injection
public class SpringDeveloper  implements  Developer{
    @Override
    public String getDeveloperName() {
        return "the developer is ahmad";
    }
}
