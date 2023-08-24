package Overloading;

public class Test {
public static void main(String[] args) {
	A a=new A();
	a.m1();
	a.m1(3);
	a.m1(3, 4);
	a.m1("ABC");
	System.out.println();
}
}
