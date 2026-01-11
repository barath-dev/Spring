package com.killer.DependencyInjection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //Used to indicate this should be preffered in case of a conflict
public class Cpu implements Processor{
    

    public void think(){
        System.out.println("Cpu is calculation with binary");
    }

    public void execute(){
        System.out.println("Brain is executing the task");
    }
}
