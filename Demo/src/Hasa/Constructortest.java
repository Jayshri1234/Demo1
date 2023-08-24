package Hasa;

public class Constructortest {


public static void main(String[] args) {
	
	Constructoraddress ad=new Constructoraddress("Pune","Khadki");
	
	Constructorstudent stu=new Constructorstudent(1,"xyz",ad);
	
	//Constructoraddress ad=new Constructoraddress("Pune","Khadki");
	System.out.println(stu.rollno);
	System.out.println(stu.name);
	System.out.println(stu.addr.cityname);
	System.out.println(stu.addr.areaname);
}
}
