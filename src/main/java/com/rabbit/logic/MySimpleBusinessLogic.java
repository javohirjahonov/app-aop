package com.rabbit.logic;

import org.springframework.stereotype.Component;

@Component
public class MySimpleBusinessLogic {

    private final MyTest myTest;

    public MySimpleBusinessLogic(MyTest myTest) {
        this.myTest = myTest;
    }

    public String doSmth() {
        return "OK";
    }

}