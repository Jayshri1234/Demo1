package task;

public class Main {
public static void main(String[] args) {
	Company c=new Company("Jayshri","Pune",10,1234567890);
	System.out.println(c.name);
	System.out.println(c.location);
	System.out.println(c.turnover);
	System.out.println(c.mobno);
	Manager m=new Manager(34,"Jayshri","IT",23000,1287659756);
	System.out.println(m.id);
	System.out.println(m.name);
	System.out.println(m.department);
	System.out.println(m.salary);
	System.out.println(m.mobno);
}
}
