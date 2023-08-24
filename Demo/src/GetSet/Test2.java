package GetSet;

public class Test2 {
public static void main(String[] args) {
	Student stu=new Student();
	stu.setRollno(5);
	stu.setName("xyz");
	Student stu1=new Student();
	stu1.setRollno(6);
	stu1.setName("pqr");
	System.out.println(stu.getRollno());
	System.out.println(stu.getName());
	System.out.println(stu1.getRollno());
	System.out.println(stu1.getName());
	
}
}
