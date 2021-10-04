package com.gcu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.gcu" })
public class Activity2Application {

	public static void main(String[] args) {
		SpringApplication.run(Activity2Application.class, args);
	}

}
