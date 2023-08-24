package type_casting;

public class A2 {
	
		public String m1()
		{
			return "CJC";                                               
		}
		public Object m2()
		{
			return "karvenagar" ;
		}
		public int m3()
		{
			return 10;
		}
		public double m4()
		{
			return 10d;
		}
		public byte m5()
		{
			return 25;
		}
		
		public static void main(String[] args) 
		{
			A2 a=new A2();

			String s=(String)a.m1();
			Object o=a.m1();
			String d=(String)a.m1();
           System.out.println(s);
           System.out.println(o);
           System.out.println(d);
           
			Object o1=a.m2();
			String s1=(String)a.m2();
			System.out.println(o1);
			String s2=(String)a.m2();
			System.out.println(s1);

			long l=a.m3();
			byte b=(byte) a.m3();
			short s3=(short)a.m3();
			System.out.println(l);
			System.out.println(b);
			System.out.println(s3);
			
			
			double d1=a.m4();
			double s4=(double)a.m4();
		    byte b1=a.m5();
			int i=a.m5();
			
			System.out.println(d1);
			System.out.println(s4);
			System.out.println(b1);
			System.out.println(i);
		}
	}


