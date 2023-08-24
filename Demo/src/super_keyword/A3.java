package super_keyword;

public class A3 {
	public A3(){
		this(10.1f);
		System.out.println("No-arg-constructor_A");

}
	public A3(int x){
		this();
		System.out.println("int_arg-constructor_A");
	  }
	public A3(double x){
		System.out.println("double_arg-constructor_A");
	    }

}
