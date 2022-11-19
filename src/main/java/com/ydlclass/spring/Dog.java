package com.ydlclass.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


// spring扫描的都是class文件，不是java代码
// 相当于在xml里写了<bean class="com.ydlclass.spring.Dog"/>
@Component
public class Dog extends Pet {
    private Human owner;
    
    @Autowired
    public Dog() {
        System.out.println("dog bore");
    }
    
    public Dog(Human owner) {
        this.owner = owner;
        
    }
    
    public void run() {
        System.out.println("dog is running...");
    }
    
    @PostConstruct
    public void init() {
        System.out.println("dog grew up");
    }
    
    @PreDestroy
    public void destroy() {
        System.out.println("dog died");
    }
    
}
