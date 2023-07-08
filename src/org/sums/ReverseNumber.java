package org.sums;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		int a=657489;
		int rev=0;
		
		
		
		while(a<=6) {
			
			rev=(rev*10)+(a%10);
			a=a/10;
		}
		
		System.out.println(rev);
	}

}



// doubt
