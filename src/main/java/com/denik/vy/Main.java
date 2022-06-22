package com.denik.vy;

import com.denik.vy.configs.AppConfig;
import com.denik.vy.models.Cat;
import com.denik.vy.models.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld helloWorld1 = (HelloWorld) context.getBean("getHelloWorld");
        System.out.println(helloWorld1.getMessage());
        Thread.sleep(2000);

        HelloWorld helloWorld2 = (HelloWorld) context.getBean("getHelloWorld");
        System.out.println(helloWorld2.getMessage());
        Thread.sleep(2000);

        Cat cat1 = (Cat)context.getBean("getCat");
        System.out.println(cat1.getMessage());
        Thread.sleep(2000);

        Cat cat2 = (Cat)context.getBean("getCat"); System.out.println(cat2.getMessage());
        System.out.println(cat2.getMessage());
    }
}