package com.oops.Bmw;

public class Bmw {
	
	private int speed;
		
    private int rpm;

    private String color;

	int getSpeed() {
		return speed;
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}

	int getRpm() {
		return rpm;
	}

	void setRpm(int rpm) {
		this.rpm = rpm;
	}

	String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}
	
	void start() {
		
		System.out.println("Car Running");
		
		System.out.println("At Normal Speed");
		
	}
    

}
