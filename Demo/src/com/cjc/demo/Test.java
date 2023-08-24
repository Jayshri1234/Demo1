package com.cjc.demo;
import java.util.Scanner;
public class Test {
public static void main(String[] args) {
	Test t=new Test();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	int x=sc.nextInt();
	
	if(x>0)
	{
		System.out.println("No is positive"+x);
	}
	else {
		System.out.println("No is negative"+x);
	}
	
}
}
