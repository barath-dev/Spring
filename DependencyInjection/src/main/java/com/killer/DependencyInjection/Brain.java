package com.killer.DependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class Brain implements Processor{
    

    public void think(){
        System.out.println("Brain is thinking");
    }

    public void execute(){
        System.out.println("Brain is executing the task");
    }
}
