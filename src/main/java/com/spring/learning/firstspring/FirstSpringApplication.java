package com.spring.learning.firstspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringApplication {
	// first application for bigenners
	public static void main(String[] args) {
		BinarySearchImpl binarySearchImpl = new BinarySearchImpl();
		int result = binarySearchImpl.binarySearch(new int[] {1,2,5,6,7}, 2);
		System.out.println(result);
		SpringApplication.run(FirstSpringApplication.class, args);
	}

}
