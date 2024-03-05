package com.example.loosecoupling.helloworld;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
       // Launch a Spring context
       var context = new  AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        // configure the things that we want spring to manage  - Configuration class
        System.out.println(context.getBean("name"));
        // get the int bean
        System.out.println(context.getBean("age"));
        // get the class bean
        System.out.println(context.getBean("person"));
        // get the class bean
        System.out.println(context.getBean("person2MethodCall"));
        // get the address bean
        System.out.println(context.getBean("address2"));
        // get the bean using class
        System.out.println(context.getBean(Address.class));

        System.out.println(context.getBean(Person.class));

        // get the bean using parameters
        System.out.println(context.getBean("person3Parameters"));
        // get all beans
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out :: println);

        // use qualifier
        System.out.println(context.getBean("person5Qualifier"));
    }
}
