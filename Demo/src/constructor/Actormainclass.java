package constructor;
import java.util.Scanner;

public class Actormainclass {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter aname,mobileno,dob,address and moviename");
		Actor a1=new Actor(sc.next(),sc.nextLong(),sc.next(),sc.next(),sc.next());
		
		System.out.println("Enter aname,mobileno,dob,address and moviename");
		Actor a2=new Actor(sc.next(),sc.nextLong(),sc.next(),sc.next(),sc.next());
		
		System.out.println(a1.aname);
		System.out.println(a1.mobileno);
		System.out.println(a1.dob);
		System.out.println(a1.address);
		System.out.println(a1.moviename);
		
		System.out.println(a2.aname);
		System.out.println(a2.mobileno);
		System.out.println(a2.dob);
		System.out.println(a2.address);
		System.out.println(a2.moviename);
		
}
}
