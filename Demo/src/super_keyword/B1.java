package super_keyword;

public class B1 extends A {
	  public B1(){
		  this("hi");
			System.out.println("No-arg-constructor_B");
			//this("hi"); needs to add first class line of child class
		}
		public B1(String x){
			super();
			//this();
			System.out.println("arg-constructor_B");
			//this();

}
}