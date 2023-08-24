package super_keyword;

public class Parent1 {
	   public Parent1(){
			System.out.println("constructor_parent");
		   }
		 public Parent1(String s){
			this();
			System.out.println("parameterized constructor_parent");
		   }

}
