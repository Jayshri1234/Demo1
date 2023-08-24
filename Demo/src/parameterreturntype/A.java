package parameterreturntype;

public class A {
public void sum(int a,int b)
{
	int c=a+b;
	System.out.println(c);
}
public static void main(String args[])
{
	A a=new A();
	a.sum(100, 200);
}
}
