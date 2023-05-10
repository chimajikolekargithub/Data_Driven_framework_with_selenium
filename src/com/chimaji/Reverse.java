package com.chimaji;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="My Name is Amruta";
		
		     String words[]= str.split("\\s");
		     
		     String reveresed="";
		     for(int i=0;i<words.length;i++)
		     {
		    	 
		    	     String word=words[i];
		    	     String Reverseword="";
		    	     for(int j=word.length()-1;j>=0;j--)
		    	     {
		    	    	 Reverseword=Reverseword+word.charAt(j);
		    	    	 
		    	    	 
		    	     }
		    	     reveresed=reveresed+Reverseword +" ";
		    	                      
		     }
		     System.out.println("Reversed string :"+reveresed);
		     
		     
		
	}
}