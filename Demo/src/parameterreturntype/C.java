package parameterreturntype;
import java.util.Scanner;
public class C {
	public int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public static void main (String args[])
	{
		//C c=new C();
		Scanner sc = new Scanner(System.in); 
			System.out.println("Enter first number");
			int a=sc.nextInt();
			System.out.println("Enter second number");
			int b=sc.nextInt();
			//System.out.println(c);
			C c=new C();
	int d=c.sum(a, b);
		
	}
}
