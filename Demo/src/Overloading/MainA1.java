package Overloading;

public class MainA1 {
	public static void main(String[] args) {
		A1 a=new A1();
		int x=a.display(20);
		System.out.println("display_int_method output:"+x);
		double y=a.display(10.1, 10.1);
		System.out.println("display_double_method output: "+y);
		a.display("Hello");
		a.display();
	}
}


