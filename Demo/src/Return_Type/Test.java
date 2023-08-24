package Return_Type;

public class Test {

	public Bank setdata()
	{
		
		Person p=new Person();
		p.setPname("jayu");
		p.setPaddr("Pune");
		p.setPmob(45667676721l);
		
		Account a=new Account();
		a.setAccno(115);
		a.setAcctype("Join");
		a.setP(p);
		
		Bank b=new Bank();
		b.setBname("HDFC");
	  b.setBranch("Pune");
		return b;
		
	}
	
	public void getdata(Bank b) {
		
	}
}
