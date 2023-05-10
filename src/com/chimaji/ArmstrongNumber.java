package com.chimaji;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int c=0, a,temp;
		 
        int no=153;
        temp=no;
		
		while(no>0)
		{
			
			a=no%10;
			no=no/10;
			c=c+(a*a*a);
			
		}
		if(temp==c)
			System.out.println("Armstrong number");
		else 
			System.out.println("Not Armstrong number");
	}

}
