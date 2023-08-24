package parameterreturntype;

public class Demo {

	public int sum()
	{
Calculator c=new Calculator();
	c.a=60;
	c.b=20;
	int d=c.a+c.b;
	System.out.println(d);
	return d;
	}
	public int sub()
	{
		Calculator c=new Calculator();
		c.a=50;
		c.b=20;
		int d2=c.a-c.b;
		System.out.println(d2);
		return d2;
	
	}
	public float mul()
	{
		Calculator c=new Calculator();
		c.x=2.3f;
		c.y=2.3f;
		
		float d1=c.x*c.y;
		System.out.println(d1);
		return d1;
	}
	
	public float div()
	{
		Calculator c=new Calculator();
		c.x=2.356f;
		c.y=2.356f;
		
		float f=c.x/c.y;
		System.out.println(f);
		return f;
	
	}
	public static void main(String args[])
	{
		Demo e=new Demo();
		int d=e.sum();
		int d2=e.sub();
		float d1=e.mul();
		float f=e.div();
	}
	
}
