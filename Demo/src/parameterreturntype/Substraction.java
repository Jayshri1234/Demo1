package parameterreturntype;

public class Substraction {
	public int sub(int a, int b)
	{
		
	D d=new D();
    d.x=a;
   d.y=b;
   int c=d.x-d.y;
   System.out.println(c);
  return c;
}


 public static void main(String args[])
 {
  //call method here
	 Substraction a=new Substraction();
		a.sub(10, 20);
		
		
		
 }
}
