package com.oops.MotorBike;

public class MotorBike {
	
	private int speed;
	
	MotorBike(int speed){
	       this.speed = speed;
		}		
				 
	
	private String color;
			 
	MotorBike(String color) {
       this.color = color;
	 }
	int getSpeed() {
		return speed;
	}
	void setSpeed(int speed) {
		if(speed>0)
		this.speed = speed;
	}
	
	String getColor() {
		return color;
	}
	void setColor(String color) {
		this.color = color;
	}
	public void increaseSpeed(int howMuch) {
		this.speed = this.speed + howMuch;
	}
	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}
	
	void start() {
		System.out.println("Bike Running");
	}
		
	
	

}
