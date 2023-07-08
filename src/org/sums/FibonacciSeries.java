package org.sums;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
// there is always a formula for fibonacci series 
		
// c=a+b
// a=b
// b=c		

		// we want to declare a as 0 and b as 1
		
		int a=0,b=1;
		
		// so  i want the fibonacci series of firs 10 numbers
		
		for (int i = 0; i <=10; i++) {
		
			int c=a+b;
			System.out.println(c);
			
			a=b;
			b=c;
			
		}
		
		
	}

}
