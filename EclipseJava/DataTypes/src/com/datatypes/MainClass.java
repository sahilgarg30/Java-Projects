package com.datatypes;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		System.out.println(c1.price);
		System.out.println(c1.isABS);
		System.out.println(c1.c);
		System.out.println(c1.length);
		System.out.println(c1.f);
		
		c1.length = 50;
		c1.price = 60;
		Car c2 = new Car();
		c2.length = 70;
		c2.price = 80;
		System.out.println(c1.price);
		System.out.println(Car.price);
		Car.moving();
		
	}

}
