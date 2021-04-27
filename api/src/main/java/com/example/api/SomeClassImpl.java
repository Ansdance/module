package com.example.api;

import org.springframework.stereotype.Service;

@Service
public class SomeClassImpl implements SomeClassInterface{
    @Override
    public void getName() {
        System.out.println("SALEM alem");
    }
}
