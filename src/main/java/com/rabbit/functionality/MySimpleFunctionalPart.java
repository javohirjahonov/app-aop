package com.rabbit.functionality;

import org.springframework.stereotype.Component;

@Component
public class MySimpleFunctionalPart {

    public void myFunctionalPart(Object object) {
        System.out.println("I work everywhere: " + object);
    }
}
