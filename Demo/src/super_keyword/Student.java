package super_keyword;

public class Student extends Person  {
	public void msg(){ 
		System.out.println("student class"); 
	}
	public void display() { 
		msg();
		super.msg(); 
	} 

}
