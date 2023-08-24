package task;

public class Company {


	String name;
	String  location;
	int turnover;
	long mobno;
	public Company(String name,String location,int turnover,long mobno) 
	{
	this.name=name;	
	this.location=location;
	this.turnover=turnover;
	this.mobno=mobno;
	}

public static void main(String[] args) {
	Company c=new Company("Jayshri","Pune",10,1234567890);
	System.out.println(c.name);
	System.out.println(c.location);
	System.out.println(c.turnover);
	System.out.println(c.mobno);
	
}
}
