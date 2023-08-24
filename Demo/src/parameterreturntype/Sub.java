package parameterreturntype;

public class Sub {
	public int sub()
	{
		D d=new D();
		d.x=90;
		d.y=20;
		
		int c=d.x-d.y;
		System.out.println(c);
		return c;
	
	}
	public static void main(String args[])
	{
		Sub e=new Sub();
		int c=e.sub();
	}
	
}
