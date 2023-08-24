package Overloading;

public class Check_overloading {
	public void mt(float x){
		
	}
	public void mt(int x){
	}
	public int mt(int y,double x){
		return 10;
	}
	public void mt(double x){	
	}
	public void mt(int x, int y){	
	}
	public String mt(){
		return "cjc";
	}
	public static void main(String args[]){
		Check_overloading c= new Check_overloading();
		c.mt(100, 20.67f);
}
}
