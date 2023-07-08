package org.sums;

public class Swapping {
	
	// when it comes to swapping there is formula
	// a=a+b
	// b=a-b
	// a=a-b
	
	
	public static void main(String[] args) {
		
		int a=50,b=60;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a is 50 then but now:"+" "+a);
		System.out.println("b is 60 then but now:"+" "+b);
	}
}
