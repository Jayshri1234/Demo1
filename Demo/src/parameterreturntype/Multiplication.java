package parameterreturntype;

public class Multiplication {

	public double mul()
	{
		G g=new G();
		g.x=2.3;
		g.y=2.3;
		
		double c=g.x*g.y;
		System.out.println(c);
		return c;
	}
	
	public static void main(String args[])
	{
		Multiplication e=new Multiplication();
		double c=e.mul();
		
	}
}
