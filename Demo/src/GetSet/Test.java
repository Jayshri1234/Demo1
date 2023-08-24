package GetSet;
import java.util.Scanner;
public class Test {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Employee e=new Employee();
	System.out.println("Enter first employee id");
	e.setId(sc.nextInt());
	System.out.println("Enter first employee name");
	e.setName(sc.next());
	System.out.println("Enter first employee salary");
	e.setSalary(sc.nextFloat());
	Employee e1=new Employee();
	System.out.println("Enter second employee id");
	e1.setId(sc.nextInt());
	System.out.println("Enter second employee name");
	e1.setName(sc.next());
	System.out.println("Enter second employee salary");
	e1.setSalary(sc.nextFloat());
	System.out.println(e.getId());
	System.out.println(e.getName());
	System.out.println(e.getSalary());
	System.out.println(e1.getId());
	System.out.println(e1.getName());
	System.out.println(e1.getSalary());
}
}
