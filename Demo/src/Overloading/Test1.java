package Overloading;

public class Test1 {
	public static void main(String args[]){ 
		System.out.println("Normal main method"); 
		//Test1.main("cjc"); ----this is object creation
	}

	public static void main(String arg1){ 
		System.out.println("without array main method: " + arg1); 
		//Test.main("cjc", "classes"); 
} 
	public static void main(String arg1, String arg2) { 
		System.out.println("two paramerter main method: "+ arg1		+", "+arg2); 
} 

}
