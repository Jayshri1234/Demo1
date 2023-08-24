package constructor;
import java.util.Scanner;

public class Main {
	
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter name,location,turnover and mobno");
	Company c1=new Company(sc.next(),sc.next(),sc.nextInt(),sc.nextLong());
	
	System.out.println("Enter name,location,turnover and mobno");
	Company c2=new Company(sc.next(),sc.next(),sc.nextInt(),sc.nextLong());
	
	System.out.println(c1.name);
	System.out.println(c1.location);
	System.out.println(c1.turnover);
	System.out.println(c1.mobno);
	
	System.out.println(c2.name);
	System.out.println(c2.location);
	System.out.println(c2.turnover);
	System.out.println(c2.mobno);
}
}
