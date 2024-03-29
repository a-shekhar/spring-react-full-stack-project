package com.springboot.springaop.data;

import org.springframework.stereotype.Repository;

@Repository
public class DataService1 {
    public int[] retrieveData(){
        return new int[] {23,455,67,34,47,78};
    }
}
