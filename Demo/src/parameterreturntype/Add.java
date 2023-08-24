package parameterreturntype;

public class Add {
	public int add(int a, int b)
	  {
		D d=new D();
	      d.x=a;
	     d.y=b;
	     int c=d.x+d.y;
	     System.out.println(c);
	    return c;
	  }
	  
	
	   public static void main(String args[])
	   {
	    //call method here
		   Add a=new Add();
			a.add(10, 20);
			
			
			
	   }
	   
}
