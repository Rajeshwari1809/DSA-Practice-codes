package com.app.recursion;

public class fibonacciSeries {
	
	

	
	
	public static void printfibonacci(int n, int a, int b)
	{
		
		if(n==0)
		{
			return ;
			
		}
		
		int c=a+b;
		System.out.println(c);
		a=b;
		printfibonacci(b,c,n-1);
		
	}

	public static void main(String[] args) {
		int a=0,b=1;
		System.out.print(a);
		System.out.println(b);
		int n =7;
		printfibonacci(a, b, n-2);
		
		
		

	}

}
