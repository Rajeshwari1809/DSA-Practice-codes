package com.app.strings;

import java.util.Scanner;

public class Strings {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter string ");
		String s1=sc.next();
		String nstr="";
		char ch;
		for(int i=0;i<s1.length();i++)
		{
			ch=s1.charAt(i);
			nstr= ch + nstr;
			
		}
		System.out.println(nstr);
			
		
	}
}
