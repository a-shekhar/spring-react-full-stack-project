package com.example.loosecoupling.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// record - released in JDK 16
record  Person (String name, int age, Address address){};
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
        var person = new Person("Raj", 16, new Address("1st Line", "Patna"));
        return person;
    }

    @Bean
    public Person person2MethodCall(){
        var person = new Person(name(), age(), address());
        return person;
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3){ //name, age, address2
        var person = new Person(name, age, address3);
        return person;
    }

    @Bean
    @Primary
    public Person person4Parameters(String name, int age, Address address){ //name, age, address2
        var person = new Person(name, age, address);
        return person;
    }

    @Bean
    public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address){ //name, age, address2
        var person = new Person(name, age, address);
        return person;
    }


    @Bean(name = "address2")
    @Primary
    public Address address(){
        var address = new Address("26/A", "Mysuru");
        return address;
    }

    @Bean(name = "address3")
    @Qualifier("address3qualifier")
    public Address address3(){
        var address = new Address("2nd street", "Bengaluru");
        return address;
    }
}
