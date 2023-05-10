package com.chimaji;

public class Reversebutnotchangesequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="My name is sanidhya";

		String [] words=str.split("\\s");
		
		String Reversed="";
		
		//make it one word 
		for(int i=0;i<words.length;i++)
		{
		String word=words[i];
		String Reverseword="";
		for(int j=word.length()-1;j>=0;j--)
		{
			Reverseword=Reverseword	+word.charAt(j);
			
			
		}
		
		Reversed=Reversed+Reverseword+" ";	
			
		}
		
	System.out.println("Revers string="+Reversed);
		
		
	}

}
