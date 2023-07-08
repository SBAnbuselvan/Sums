package org.sums;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String a="Noon";
		String b="";
		
		for(int i =a.length()-1;i>=0;i--) {
			
			char c = a.charAt(i);
			
			b=b+c;
		}		
     if(b.equalsIgnoreCase(a)) {
	System.out.println("Palindrome");
     }else {
	System.out.println("Not a palindrome");
}
		
		
			
		}
		
		
	}
