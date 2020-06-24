package com.oops.Bmw;

public class BmwRunner {

	public static void main(String[] args) {
	
		Bmw Series3 = new Bmw();
		Bmw Series5 = new Bmw();
		Bmw Series7 = new Bmw();
		Bmw Series10 = new Bmw();
		
		Series3.start();
		Series5.start();
		Series7.start();
		Series10.start();
		
		Series3.setSpeed(70);
		
		System.out.println(Series3.getSpeed());
		
		Series5.setSpeed(95);
		
		System.out.println(Series5.getSpeed());
		
		Series7.setSpeed(120);
		
		System.out.println(Series7.getSpeed());
		
		Series10.setSpeed(143);
		
		System.out.println(Series10.getSpeed());
		
		Series3.setRpm(700);
		
		System.out.println(Series3.getRpm());
		
		Series5.setRpm(850);
		
		System.out.println(Series5.getRpm());
		
		Series7.setRpm(1000);
		
		System.out.println(Series7.getRpm());
		
		Series10.setRpm(1400);
		
		System.out.println(Series10.getRpm());
		
		Series3.setColor("black");
		
		System.out.println(Series3.getColor());
		
		Series5.setColor("blue");
		
		System.out.println(Series5.getColor());
		
		Series7.setColor("red");
		
		System.out.println(Series7.getColor());
		
		Series10.setColor("brown");
		
		System.out.println(Series10.getColor());

	}

}
