package com.Primitive.BiNumber;

public class BiNumberRunner {

	public static void main(String[] args) {
	
		BiNumber numbers = new BiNumber(10,20);
		System.out.println(numbers.add());
		System.out.println(numbers.multiply());
		
		
		numbers.doubleValue();
		
		System.out.println(numbers.getNumber1());
		System.out.println(numbers.getNumber2());

	}

}
