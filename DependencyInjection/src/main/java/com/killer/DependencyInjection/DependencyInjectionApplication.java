package com.killer.DependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		

		ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);

		Temp x = context.getBean(Temp.class);

		x.build();
	}

}
