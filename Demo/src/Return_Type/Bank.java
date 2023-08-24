package Return_Type;

public class Bank {
	 private String bname;
	   private String branch;
	   private String addr;
	   private Account ac;
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Account getAc() {
		return ac;
	}
	public void setAc(Account ac) {
		this.ac = ac;
	}
}
