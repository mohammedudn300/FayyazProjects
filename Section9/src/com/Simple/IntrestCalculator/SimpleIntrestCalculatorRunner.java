package com.Simple.IntrestCalculator;

public class SimpleIntrestCalculatorRunner {

	public static void main(String[] args) {
	
		
		SimpleIntrestCalculator calculator = 
				new SimpleIntrestCalculator("4500.00" , "7.5");
		BigDecimal totalValue =
				calculator.calculateTotalValue(5);// 5 years
		System.out.println(totalvalue);
						 

	}

}
