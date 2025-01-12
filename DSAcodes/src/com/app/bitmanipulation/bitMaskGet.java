package com.app.bitmanipulation;

import java.util.Scanner;

public class bitMaskGet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number and position");
		int num=sc.nextInt();
		int pos=sc.nextInt();
		
		
		int bm=1<<pos;
		
		
		if((bm & num)==0)
		{
			System.out.println("bit of the position is zero");
		}
		else {
			System.out.println("bit of the postion is 1");
		}

	}

}
