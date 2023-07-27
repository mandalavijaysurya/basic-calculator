package com.chintu.basicCalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.chintu")
public class BasicCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicCalculatorApplication.class, args);
	}

}
