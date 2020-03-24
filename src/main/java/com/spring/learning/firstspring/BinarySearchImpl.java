package com.spring.learning.firstspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	// sorting an array 
	// search in the array
	// return the result 
	
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	
	
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		int[] result =  this.sortAlgorithm.sort(numbers);
		return 0;
	}
}
