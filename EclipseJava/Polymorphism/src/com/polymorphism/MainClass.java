package com.polymorphism;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Vehicle();
		v1.moving();
		v1 = new Bike();
		v1 = new Car();
		v1.moving();
		Car c1 = new Car();
		c1.moving();
		v1.reverse();
		v1.reverse(70);
		if(v1 instanceof Car){
			System.out.println("Is a car!");
		}
			else{
				System.out.println("Is a bike!");
		}
	}

}
