package constructor;
import java.util.Scanner;
public class Sctest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter id,name and salary");
	Scemployee e1=new Scemployee(sc.nextInt(),sc.next(),sc.nextFloat());
	System.out.println("Enter id,name and salary");
	Scemployee e2=new Scemployee(sc.nextInt(),sc.next(),sc.nextFloat());
	System.out.println(e1.id);
	System.out.println(e1.name);
	System.out.println(e1.salary);
	System.out.println(e2.id);
	System.out.println(e2.name);
	System.out.println(e2.salary);
}
}
