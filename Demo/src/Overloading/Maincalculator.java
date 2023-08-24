package Overloading;

public class Maincalculator {
	public static void main(String[] args){
	Calculator c=new Calculator();
	c.calculate(10, 20);
	c.calculate(10,20,30);
	c.calculate(10.1f,10.1f);
	c.calculate(20.2d,20.2d);
	c.calculate(10.1d,10);
	c.calculate(10,20.1d);

}
}