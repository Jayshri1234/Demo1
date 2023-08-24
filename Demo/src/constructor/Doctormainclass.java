package constructor;

import java.util.Scanner;

public class Doctormainclass {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter did,dname,daddr,nhospital,mobileno and salary");
		Doctor d1=new Doctor(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.nextLong(),sc.nextDouble());
		
		System.out.println("Enter did,dname,daddr,nhospital,mobileno and salary");
		Doctor d2=new Doctor(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.nextLong(),sc.nextDouble());
	
		System.out.println(d1.did);
		System.out.println(d1.dname);
		System.out.println(d1.daddr);
		System.out.println(d1.nhospital);
		System.out.println(d1.mobileno);
		System.out.println(d1.salary);
		
		System.out.println(d1.did);
		System.out.println(d1.dname);
		System.out.println(d1.daddr);
		System.out.println(d1.nhospital);
		System.out.println(d1.mobileno);
		System.out.println(d1.salary);
	}
}
