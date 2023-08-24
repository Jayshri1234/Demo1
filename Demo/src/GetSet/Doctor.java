package GetSet;

public class Doctor {
	private int did;
	 private String dname;
	 private String daddr;
	 private String nhospital;
	 private long mobileno;
	 private double salary;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDaddr() {
		return daddr;
	}
	public void setDaddr(String daddr) {
		this.daddr = daddr;
	}
	public String getNhospital() {
		return nhospital;
	}
	public void setNhospital(String nhospital) {
		this.nhospital = nhospital;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
