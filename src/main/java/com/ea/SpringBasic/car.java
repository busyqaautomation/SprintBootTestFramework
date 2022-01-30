package com.ea.SpringBasic;

import org.springframework.stereotype.Component;

@Component
public class car {
	public car() {
		System.out.println("car instantiated");
	}

	public void getcar() {
		System.out.println("Toyota car");
	}
}
