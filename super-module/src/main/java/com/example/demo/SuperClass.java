package com.example.demo;

import com.example.api.SomeClassInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
//@Component("someClassInterface")
public class SuperClass {

    @Autowired
//    @Qualifier(com.example.api.SomeClassInterface)
    private SomeClassInterface someClassInterface;

    public void getName(){
        someClassInterface.getName();
    };
}
