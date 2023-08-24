package com.cjc.demo;

import java.util.Scanner;

public class Calculator {
	public void sum(int a,int b)
	{
	int c=a+b;
	System.out.println(c);
	}
	public void sub(int a,int b)
	{
	int c=a-b;
	System.out.println(c);
	}
	public void div(int a,int b)
	{
	int c=a/b;
	System.out.println(c);
	}
	public void mul(int a,int b)
	{
	int c=a/b;
	System.out.println(c);
	}
	public static void main(String args[])
	{
		Calculator c=new Calculator();
		
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		c.sum(a,b);
		c.sub(a,b);
		c.div(a,b);
		c.mul(a,b);
	}

	
}
