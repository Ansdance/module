package com.example.impl;

import com.example.api.SomeClassInterface;
import org.springframework.stereotype.Service;

//@ComponentScan(basePackages = "com.example.api")
//@Service("SomeClassInterface")
//@SpringBootApplication(scanBasePackages = "com.example.api")
@Service
public class SomeClassImpl implements SomeClassInterface {
    @Override
    public void getName() {
        System.out.println("SALEM alem");
    }
}
