package com.app.javapj;

import com.app.javapj.controller.TestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackageClasses = TestController.class)
public class JavapjApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavapjApplication.class, args);
	}

}
