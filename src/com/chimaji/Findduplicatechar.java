package com.chimaji;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Findduplicatechar {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dulicatecharinstring("shubhangi kolekar");

	}
	
	public static void dulicatecharinstring(String str)
	{
		
		   if(str==null)
		   {
			   System.out.println("Null String");
			   return;
		   }
		   if(str.isEmpty())
		   {
			  System.out.println("Empty string");
			  return;
		   }
		   
		   if(str.length()==1)
		   {
			   System.out.println("single character string");
			   return;
		   }
		   
		         char[] words =str.toCharArray();
		        Map<Character, Integer>map = new HashMap<Character,Integer>();
		         
		         for(Character c:words)
		         {
		        	 if(map.containsKey(c))
		        	 {
		        		map.put(c, map.get(c)+1); 
		        	 }
		        	 else
		        	 {
		        		 map.put(c,1);
		        	 }
		         }
		         System.out.println(map);
		                   //print the map object
       Set<Entry<Character,Integer>> Entryset =map.entrySet();
       
  for(Map.Entry<Character, Integer>entry:Entryset)
  
{
	  if(entry.getValue()>1)
		  System.out.println(entry.getKey()+":"+entry.getValue());
	  
 }


	}

}
