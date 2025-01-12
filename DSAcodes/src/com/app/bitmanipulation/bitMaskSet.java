package com.app.bitmanipulation;

import java.util.Scanner;

public class bitMaskSet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number and position to set");
		int num=sc.nextInt();
		
		int pos=sc.nextInt();
		
		int bs=1<<pos;
		
	    int updnum=bs | num;
	    
	    System.out.println(updnum);
	    System.out.println("bit set succesfully");
	}

}
