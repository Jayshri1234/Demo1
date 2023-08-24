package GetSet;
import java.util.Scanner;
public class Actortest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Actor a=new Actor();
	System.out.println("Enter actor name");
	a.setAname(sc.next());
	System.out.println("Enter actor mobileno");
	a.setMobileno(sc.nextLong());
	System.out.println("Enter actor dob");
	a.setDob(sc.next());
	System.out.println("enter actor address");
	a.setAddress(sc.next());
	System.out.println("enter actor moviename");
	a.setMoviename(sc.next());
	System.out.println(a.getAname());
	System.out.println(a.getMobileno());
	System.out.println(a.getDob());
	System.out.println(a.getAddress());
	System.out.println(a.getMoviename());
}
}
