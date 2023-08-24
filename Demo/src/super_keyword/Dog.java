package super_keyword;

public class Dog extends Animal {
	public void eat(){
		System.out.println("cat= "+super.cat);
			System.out.println("eating bread...");
		}  
		public void bark(){
			System.out.println("barking...");
		}  
		public void work(){  
			super.eat("Mango");  
			eat();
			bark();  
		}
}
