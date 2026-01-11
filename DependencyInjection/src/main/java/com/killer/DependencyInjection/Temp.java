package com.killer.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Temp {
    
    //Method 1: Field Injection
    @Autowired  
    @Qualifier("brain") // to annoate the compiler to choose brain which implements Processor interface
    Processor brain; //Uses 

    //Method 2: Constructor Injection
    // Temp(Brain brain){
    //     this.brain = brain;
    // }

    //Method 3: Setter Injection
    // @Autowired
    // public void setBrain(Brain brain){
    //     this.brain = brain;
    // }


    
    public void build(){

        brain.think();

        // brain.execute();

        System.out.println("Temp is building the project");
    }
}
