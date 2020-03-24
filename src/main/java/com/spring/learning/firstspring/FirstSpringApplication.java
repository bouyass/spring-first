package com.spring.learning.firstspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringApplication {
	// first application for beginners
	public static void main(String[] args) {
		//BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new QuickSortAlgorithm());
		//System.out.println(result);
		ApplicationContext applicationContext =  SpringApplication.run(FirstSpringApplication.class, args);
		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearchImpl.binarySearch(new int[] {1,2,5,6,7}, 2);
		System.out.println(result);
	}

}
