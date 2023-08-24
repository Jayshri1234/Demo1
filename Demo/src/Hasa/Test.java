package Hasa;

public class Test {
public static void main(String[] args) {
	
	Address ad=new Address();
	ad.cityname="Pune";
	ad.areaname="Khadki";
	
	Student stu=new Student();
	stu.rollno=1;
	stu.name="xyz";
	stu.addr=ad;
	System.out.println(stu.rollno);
	System.out.println(stu.name);
	System.out.println(stu.addr.cityname);
	System.out.println(stu.addr.areaname);
}
}
