package com.example.demo;

import com.example.api.SomeClassInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuperClass {
    @Autowired
    private SomeClassInterface someClassInterface;

    public void getName(){
        someClassInterface.getName();
    };
}
