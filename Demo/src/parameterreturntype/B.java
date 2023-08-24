package parameterreturntype;

public class B {
	public int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public static void main(String args[])
	{
		B a=new B();
		int x=a.sum(100, 200);
		System.out.println(x);
	}
}
