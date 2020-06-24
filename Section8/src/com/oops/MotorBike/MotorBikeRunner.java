package com.oops.MotorBike;

public class MotorBikeRunner {

	public static void main(String[] args) {
	 
		MotorBike Bmw = new MotorBike(50);
		MotorBike Honda = new MotorBike(100);
		MotorBike Ducati = new MotorBike(150);
		MotorBike Tvs = new MotorBike(200);
		
		
		System.out.println(Bmw.getSpeed());
		System.out.println(Honda.getSpeed());
		System.out.println(Ducati.getSpeed());
		System.out.println(Tvs.getSpeed());
		
		Bmw.setColor("black");
		Honda.setColor("Blue");
		Ducati.setColor("red");
		Tvs.setColor("white");
		
		System.out.println(Bmw.getColor());
		System.out.println(Honda.getColor());
		System.out.println(Ducati.getColor());
		System.out.println(Tvs.getColor());
		
		Bmw.start();
		Honda.start();
		Ducati.start();
		Tvs.start();
		
		Bmw.setSpeed(250);
		Honda.setSpeed(300);
		Ducati.setSpeed(350);
		Tvs.setSpeed(400);
		
		Bmw.increaseSpeed(150);
		Honda.increaseSpeed(100);
		Ducati.increaseSpeed(50);
		Tvs.increaseSpeed(100);
		
		System.out.println(Bmw.getSpeed());
		System.out.println(Honda.getSpeed());
		System.out.println(Ducati.getSpeed());
		System.out.println(Tvs.getSpeed());
		
		
		Bmw.decreaseSpeed(100);
		Honda.decreaseSpeed(50);
		Ducati.decreaseSpeed(100);
		Tvs.decreaseSpeed(150);
		
		System.out.println(Bmw.getSpeed());
		System.out.println(Honda.getSpeed());
		System.out.println(Ducati.getSpeed());
		System.out.println(Tvs.getSpeed());
		
		
	
		
		
		
		
	}

}
