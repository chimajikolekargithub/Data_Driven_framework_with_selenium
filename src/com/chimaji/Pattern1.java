package com.chimaji;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<=4;i++)
		{
			
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
				
			}
			
			System.out.println(" ");
		}
		for(int k=4;k>=0;k--)
		{
		
			for(int l=1;l<=k;l++)
			{
				System.out.print("*");
				
			}
			
			System.out.println(" ");
		}
	}

}
