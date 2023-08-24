package constructor;

public class Emptest {
public static void main(String[] args) {
	Employee e1=new Employee(1,"xyz",5.7f);
	Employee e2=new Employee(2,"pqr",2.6f);
	System.out.println(e1.id);
	System.out.println(e1.name);
	System.out.println(e1.salary);
	System.out.println(e2.id);
	System.out.println(e2.name);
	System.out.println(e2.salary);
}
}
