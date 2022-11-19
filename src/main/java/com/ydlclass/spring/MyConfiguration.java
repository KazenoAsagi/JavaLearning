package com.ydlclass.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MyConfiguration {
    
    @Bean(name = "human")
    @Qualifier("human")
    public Human human() {
        return new Human();
    }
}
