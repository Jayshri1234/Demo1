package parameterreturntype;

public class Test {
	public int m1()
	{
		int x=10;
		return x;
		
	}
	public float m2()
	{
		float y=50f;
		return y;
	}
	public long m3()
	{
		long z=30L;
		return z;
	}
	public double m4() 
	{
		double a=20.10;
		return a;
	}
	public char m5()

{
	return 0;
		//return c;
		}
	public boolean m6()
	{
		return false;
		
	}

	public static void main(String args[])
	{
		Test t= new Test();
		t.m1();
		t.m2();
		t.m3();
		t.m4();
		t.m5();
		t.m6();
	}		
}
