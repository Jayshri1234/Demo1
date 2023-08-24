package type_casting;

public class Test {

	public A m1()
	{
		A a=new A();
		B b=new B();
		C c=new C();
		return b;
	}
	public B m2()
	{
		B b=new B();
		C c=new C();
		return c;
	}
	public C m3()
	{
		C c=new C();
		return c;
	}
	public static  void main(String[] args) {
		Test t=new Test();
		B b=(B)t.m1();
		C c=(C)t.m2();
		C c1=(C) t.m3();
		System.out.println();
	}
}
