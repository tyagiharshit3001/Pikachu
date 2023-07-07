
public class Employee extends Person {
	private int e_id;
	private double salary;
	private String orgName;
	
	
	
	public Employee() {
		
	}
	
	
	
	public Employee(int ssn, String name, int age, int e_id, double salary, String orgName) {
		super(ssn, name, age);
		this.e_id = e_id;
		this.salary = salary;
		this.orgName = orgName;
	}



	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	
	
	
	
}
