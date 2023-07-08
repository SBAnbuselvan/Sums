package org.sums;

public class Factorial {
	
	public static void main(String[] args) {
		
		int fact=1;
		
// same if we want sum
		
		int sum=0;
		
// if we want count of that both		
		
		int count=0;
		
		for (int i = 1; i <=10; i++) {
		
		fact=fact*i;
		sum=sum+i;
	
		count++;
		
		}
		
		System.out.println("Factorial of first 10 numbers is:"+" "+fact);
		System.out.println("Sum of the numbers is:"+" "+sum);
		
		System.out.println("Count of the numbers is:"+" "+count);
	}
	
	

}
