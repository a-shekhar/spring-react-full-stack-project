package com.example;

import org.springframework.stereotype.Component;

@Component
public interface DataService {
    public int[] retrieveData();
}
