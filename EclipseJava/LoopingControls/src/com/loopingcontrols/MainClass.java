package com.loopingcontrols;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int a[][] = {{5,6,3,8,9},{32,4,7,12,11}};
		for(i=0; i<a.length;i++){
			for(int j = 0;j<a[i].length;j++)
				System.out.println(a[i][j]);
		}
		
		int b[] = {1,2,3,4,5};
		for(i=0;i<b.length;i++)
			System.out.println(b[i]);
		
		for(int p:b){System.out.println(p);}
		
		for(int p[]:a){
			for(int q:p)
				System.out.println(q);
		}
		
		Gear g = new Gear() {
			
			@Override
			public void reduceRPM() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void changeGear() {
				// TODO Auto-generated method stub
				
			}
		};
		g.changeGear();
		g.reduceRPM();
	}

}
