package com.app.bitmanipulation;

import java.util.Scanner;

public class clearOperationn {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number and position to clear");
		int num=sc.nextInt();
		
		int pos=sc.nextInt();
		
		int bitmask=1<<pos;
		int newnum=~bitmask;
		int finalnum=newnum & num;
		
	     System.out.println(finalnum);
	     

	}

}
