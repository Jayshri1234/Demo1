package Overloading;

public class MainA2 {
public static void main(String[] args) {
	A2 a=new A2(10);
	A2 a1=new A2(10.0f);
	System.out.println(a.x);
	System.out.println(a.y);
}
}
