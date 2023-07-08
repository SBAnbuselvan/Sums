package org.sums;

public class ReverseLetters {
	public static void main(String[] args) {
		
		String a="Pakkir Mohammed";
		String b="";
		
		
		for (int i =a.length()-1;i>=0;i--) {
			
			char c = a.charAt(i);
		b=b+c;
		
		}
		
		System.out.println("Revere letters are:"+" "+b);
	}

}
