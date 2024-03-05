package com.example.loosecoupling;


import com.example.loosecoupling.game.GameRunner;
import com.example.loosecoupling.game.GamingConsole;
import com.example.loosecoupling.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03SpringBeans {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
        context.getBean(GamingConsole.class).up();
        context.getBean(GameRunner.class).run();
    }
}
