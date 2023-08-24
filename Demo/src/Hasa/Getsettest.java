package Hasa;

public class Getsettest {
public static void main(String[] args) {
	
	Getsetaddress ad=new Getsetaddress();
	ad.setCityname("Pune");
	ad.setAreaname("Khadki");
	
	Getsetstudent stu=new Getsetstudent();
	stu.setRollno(1);
	stu.setName("xyz");
	stu.setAdr(ad);
	
	System.out.println(stu.getRollno());
	System.out.println(stu.getName());
	System.out.println(stu.getAdr().getCityname());
	System.out.println(stu.getAdr().getAreaname());
	
	
	}
}
