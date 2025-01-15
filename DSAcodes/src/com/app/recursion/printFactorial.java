package com.app.recursion;

import java.util.Scanner;

public class printFactorial {
	
	public static int printfactorial(int n)
	{
		
		if(n==1 || n==0)
		{
			return 1;
		}
	    int fact=printfactorial(n-1);
	    int factorial=fact*n;
	    return factorial;
	    
	    		
		
		
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter number to calculate factorial");
		int num=sc.nextInt();
		int finalfact=printfactorial(num);
		System.out.println(finalfact);
		
		
	}

}
