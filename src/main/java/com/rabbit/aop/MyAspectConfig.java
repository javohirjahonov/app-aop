package com.rabbit.aop;

import com.rabbit.functionality.MySimpleFunctionalPart;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspectConfig {

    private final MySimpleFunctionalPart mySimpleFunctionalPart;

    public MyAspectConfig(MySimpleFunctionalPart mySimpleFunctionalPart) {
        this.mySimpleFunctionalPart = mySimpleFunctionalPart;
    }

    @Pointcut("execution(* com.rabbit.logic.*.*(..))")
    public void uroqPointcut() {
    }

    @AfterReturning(pointcut = "uroqPointcut()",
            returning = "response")
    public void afterKetmon(Object response) {
       mySimpleFunctionalPart.myFunctionalPart(response);
    }
}
