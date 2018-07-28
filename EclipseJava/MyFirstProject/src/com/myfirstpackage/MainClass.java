package com.myfirstpackage;

public class MainClass {

	public static void main(String[] args) {
		Pen p1 = new Pen();
		p1.height = 3;
		p1.price = 20;
		
		Pen p2 = new Pen();
		p2.height = 5;
		p2.price = 30;
		
		Pen p3 = new Pen(40,8);
		System.out.println(p3.height);
		p1.writing();
		
	}

}
