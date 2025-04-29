package com.rabbit;

import com.rabbit.logic.MySimpleBusinessLogic;
import com.rabbit.logic.MySimpleBusinessLogic2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@ComponentScan("com.rabbit")
@EnableAspectJAutoProxy
public class Demo {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ApplicationContext context = new AnnotationConfigApplicationContext(Demo.class);

        MySimpleBusinessLogic logic1 = context.getBean(MySimpleBusinessLogic.class);
        logic1.doSmth();
    }
}
