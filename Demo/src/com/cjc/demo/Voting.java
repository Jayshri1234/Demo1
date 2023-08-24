package com.cjc.demo;
import java.util.Scanner;
public class Voting {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no"); 
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("Eligible for voting");
		}
		else
		{
			System.out.println("not eligible for voting");
		}
	}
}
