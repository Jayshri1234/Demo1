package GetSet;
import java.util.Scanner;
public class Doctormain {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Doctor d=new Doctor();
	System.out.println("enter doctor id");
	d.setDid(sc.nextInt());
	System.out.println("enter doctor name");
	d.setDname(sc.next());
	System.out.println("enter doctor addr");
	d.setDaddr(sc.next());
	System.out.println("enter doctor nhospital");
	d.setNhospital(sc.next());
	System.out.println("enter doctor mobileno");
	d.setMobileno(sc.nextLong());
	System.out.println("enter doctor salary");
	d.setSalary(sc.nextDouble());
	
	System.out.println(d.getDid());
	System.out.println(d.getDname());
	System.out.println(d.getDaddr());
	System.out.println(d.getNhospital());
	System.out.println(d.getMobileno());
	System.out.println(d.getSalary());
}

}
