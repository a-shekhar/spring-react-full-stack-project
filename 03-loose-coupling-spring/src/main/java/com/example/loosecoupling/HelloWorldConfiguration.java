package com.example.loosecoupling;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.security.PublicKey;

// record - released in JDK 16
record  Person (String name, int age){};
record Address (String  firstLine, String city){};

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "Aditya";
    }

    @Bean
    public int age(){
        return 15;
    }

    @Bean
    public Person person(){
        var person = new Person("Raj", 16);
        return person;
    }

    @Bean
    public Person person2MethodCall(){
        var person = new Person(name(), age());
        return person;
    }

    @Bean(name = "address2")
    public Address address(){
        var address = new Address("26/A", "Mysuru");
        return address;
    }
}
