package com.operators;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 10;
		byte b = 20;
		byte c = (byte) (a+b);
		c = ++a;
		boolean d = (a!=b) && (a<b);
		System.out.println(a);
		System.out.println(c);
		System.out.println(d);
	}

}
