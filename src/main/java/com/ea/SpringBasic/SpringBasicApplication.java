
package com.ea.SpringBasic;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBasicApplication {

	public static void main(String[] args) {

		ApplicationContext applicationcontext =		              SpringApplication.run(SpringBasicApplication.class, args);
  car car = applicationcontext.getBean(car.class);
  car.getcar();
	
	}

}
