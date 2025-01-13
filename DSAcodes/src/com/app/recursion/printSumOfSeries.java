package com.app.recursion;

public class printSumOfSeries {
	
	public static void printSum(int i, int n , int sum)
	{
		
		while(i<=n)
		{
			sum+=i;
			i++;
				
			
			
			printSum(i,n,sum);
			
		}
		System.out.println(sum);
		
	}
	

	public static void main(String[] args) {
		
		printSum(1,5,0);
		
		
		

	}

}
