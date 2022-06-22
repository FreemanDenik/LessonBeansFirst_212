package com.denik.vy.configs;

import com.denik.vy.models.Cat;
import com.denik.vy.models.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Date;

@Configuration
public class AppConfig {
    @Bean
    public HelloWorld getHelloWorld(){
        HelloWorld helloWorld = new HelloWorld();
        Date data = new Date();
        helloWorld.setMessage("Hell World " + data);
        return helloWorld;
    }
    @Bean
    @Scope("prototype")
    public Cat getCat(){
        Cat cat = new Cat();
        Date data = new Date();
        cat.setMessage("Hell cat " + data);
        return cat;
    }
}
