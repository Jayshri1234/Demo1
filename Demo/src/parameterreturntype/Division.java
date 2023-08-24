package parameterreturntype;

public class Division {
	public float div()
	{
		F f=new F();
		f.x=2.356f;
		f.y=2.356f;
		
		float c=f.x/f.y;
		System.out.println(c);
		return c;
	
	}
	public static void main(String args[])
	{
		Division e=new Division();
		float c=e.div();
		
	}
}
