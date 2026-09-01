package com.killer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

        Dev dev = (Dev) context.getBean("dev");
        Dev dev1 = context.getBean(Dev.class);
        dev1.code();
        dev.code();
        System.out.println("Hello World!");
    }
}
