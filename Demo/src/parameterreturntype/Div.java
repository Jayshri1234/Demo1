package parameterreturntype;

public class Div {
	public float div(float a,float b)
	{
	
	F f=new F();
	
    f.x=a;
   f.y=b;
   float c=f.x/f.y;
   System.out.println(c);
  return c;
	
}
	public static void main(String args[])
	{
		Div e=new Div();
		e.div(2.356f, 2.356f);
		
	}
}

