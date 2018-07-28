package com.polymorphism;

public class Vehicle {
	int price;
	
	public void moving(){
		System.out.println("Vehicle is moving at 50km/hr.");
	}
	public void reverse(){
		System.out.println("Reverse at 40km/hr.");
	}
	public void reverse(int a){
		System.out.println("Reverse at "+ a + " km/hr.");
	}
}
