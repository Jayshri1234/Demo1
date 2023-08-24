package super_keyword;

public class Child2 extends Parent2 {
	   public Child2(){
			this(10);
			System.out.println("Constructor_child");
		   }
		   public void msg(){
			
		   }
		   public void display(){
			msg();
		   }
		   public Child2(float x){	
			super();
			System.out.println("float_Constructor_child");
		   }
}
