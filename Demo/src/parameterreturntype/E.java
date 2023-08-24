package parameterreturntype;

public class E {
	public int add()
	{
		D d=new D();
		d.x=90;
		d.y=20;
		
		int c=d.x+d.y;
		System.out.println(c);
		return c;
	
	}
	public static void main(String args[])
	{
		E e=new E();
		int c=e.add();
		
	}
	
	}
	

