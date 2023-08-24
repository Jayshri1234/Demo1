package GetSet;

public class Test1 {
public static void main(String[] args) {
	Employee emp=new Employee();
	emp.setId(1);
	emp.setName("xyz");
	emp.setSalary(20.40f);
	Employee emp1=new Employee();
	emp1.setId(1);
	emp1.setName("xyz");
	emp1.setSalary(80.40f);
	System.out.println(emp.getId());
	System.out.println(emp.getName());
	System.out.println(emp.getSalary());
	System.out.println(emp1.getId());
	System.out.println(emp1.getName());
	System.out.println(emp1.getSalary());
	
}
}
