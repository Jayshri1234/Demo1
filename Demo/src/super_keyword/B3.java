package super_keyword;

public class B3 extends A3 {
	public B3(){
		System.out.println("No-arg-constructor_B");
	  }
	public B3(String x){
		super(10);
		System.out.println("arg-constructor_B");
	  }

}
