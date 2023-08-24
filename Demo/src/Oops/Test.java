package Oops;

public class Test {

public void m1(Student stu) {
	System.out.println(stu.age);
	System.out.println(stu.name);
	System.out.println(stu.rollno);
}
public static void main(String[] args) {
	Test t=new Test();
	Student s=new Student(1,"xyz",27);
	t.m1(s);
}
}
