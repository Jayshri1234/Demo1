package Overloading;

public class Calculator {
	//number of parameters:
		public void calculate(int num1, int num2) {
			System.out.println("With two no of parameters: "+num1+ num2);
		}
	  	public void calculate(int num1, int num2, int num3){
	  		System.out.println("With three no of  parameters: "+num1+ num2+ num3);
	  	}
	  	
	  	//Type of parameters:
	  	public void calculate(float num1, float num2){
	  		System.out.println("With two float and float parameters: "+num1+num2);
	  	}
	  	public void calculate(double num1, double num2){
	  		System.out.println("With two double and double parameters: "+num1+num2);
	  	}
	  	
	  	//Order of parameters:
	  	public void calculate(double num1, int num2){
	  		System.out.println("With two different parameters: "+num1+num2);
	  	}
	  	public void calculate(int num1, double num2) {
	  		System.out.println("With two different sequence parameters:"+num1+num2);

}
}