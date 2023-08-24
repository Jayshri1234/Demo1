package parameterreturntype;

public class Multi {
	public double mul(double a,double b)
	{
		G g=new G();
		g.x=a;
		g.y=b;
		
		double c=g.x*g.y;
		System.out.println(c);
		return c;
	}
	

	public static void main(String args[])
	{
		Multi e=new Multi();
		e.mul(90.3, 90.3);
		
	}
}
