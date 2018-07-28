package com.polymorphism;

public class Car extends Vehicle {
	int width;
	
	public void turning(){
		System.out.println("Car is turning at 30km/hr.");
	}
	
	@Override
	public void moving() {
		// TODO Auto-generated method stub
		super.moving();
		System.out.println("Car is moving at 100km/hr.");
	}
}
