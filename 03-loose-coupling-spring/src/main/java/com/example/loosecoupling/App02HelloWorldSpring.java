package com.example.loosecoupling;


import com.example.loosecoupling.game.GameRunner;
import com.example.loosecoupling.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
       // Launch a Spring context
       var context = new  AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        // configure the things that we want spring to manage  - Configuration class
        System.out.println(context.getBean("name"));
    }
}