package org.sums;

public class VowelsConsonents {
	
	public static void main(String[] args) {
		
		String a="anbuselvan";
		
		String vow="";
		String cons="";
		
		int count1=0;
		int count2=0;
		
		for (int i = 0; i < a.length(); i++) {
			
			char b = a.charAt(i);
			
			if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u') {
				
				vow=vow+b;
				count1++;
			}
				else {
				
				cons=cons+b;
				count2++;
			}
		}
		System.out.println("Vowels is"+" "+ vow);
			System.out.println("Consonents is"+" "+cons);
			
			System.out.println("Total count of vowels:"+" "+count1);
			System.out.println("Total count of consonents:"+" "+count2);
		}
		
		
	

}
