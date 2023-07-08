package org.sums;

public class ReverseSentence {
	
	public static void main(String[] args) {
		
		String a="Hello this is Anbu";
		
		String[] s = a.split(" ");
		
		for (int i =s.length-1; i>=0; i--) {
		
			System.out.print(s[i]+" ");
	}
	

}
}
  

// if we give space in split only words will be reversed
// if we did not give space both letters and words will be reversed