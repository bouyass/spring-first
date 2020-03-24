package com.spring.learning.firstspring;

public class BinarySearchImpl {
	// sorting an array 
	// search in the array
	// return the result 
	
	private SortAlgorithm sortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}
	
	
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		int[] result =  this.sortAlgorithm.sort(numbers);
		return 0;
	}
}
