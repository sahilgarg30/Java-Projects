package com.myfirstpackage;

public class Pen {
	int price;
	int height;
	
	public Pen(int p, int h){
		price = p;
		height = h;
	}
	
	public Pen(){}
	
	public int writing(){
		System.out.println("Pen is used to write.");
		return height/0;
	}
}
