package parameterreturntype;

public class AllParametrizedMethods {

	public int add(int c, int d)
	  {
		Methods m=new Methods();
	      m.a=c;
	     m.b=d;
	     int f=m.a+m.b;
	     System.out.println(f);
	    return f;
	  }
	
	public int sub(int c, int d)
	{
		
		Methods m=new Methods();
		m.a=c;
	     m.b=d;
	     int f1=m.a-m.b;
	     System.out.println(f1);
	    return f1;
}
	public float mul(float a,float b)
	{
		Methods m=new Methods();
		m.x=a;
		m.y=b;
		
		float c=m.x*m.y;
		System.out.println(c);
		return c;
	}
	
	public float div(float a,float b)
	{
	
		Methods m=new Methods();
	
    m.x=a;
   m.y=b;
   float c=m.x/m.y;
   System.out.println(c);
  return c;
	
}
	public static void main(String args[])
	   {
	    //call method here
		AllParametrizedMethods a=new AllParametrizedMethods();
			a.add(10, 20);
			a.sub(10, 40);
			a.mul(5.8f, 2.9f);
			a.div(2.356f, 2.356f);
			
			
	   }
}
