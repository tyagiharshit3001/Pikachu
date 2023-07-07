
public class Loan {
	private long accNo;
	private int loanAmount;
	int tenure;
	int roI;
	
	
	
	public Loan() {
	}
	
	
	public Loan(long accNo, int loanAmount, int tenure, int roI) {
		super();
		this.accNo = accNo;
		this.loanAmount = loanAmount;
		this.tenure = tenure;
		this.roI = roI;
	}


	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public int getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}
	
	
}

class HomeLoan{
	private String location;
	int worth;
	int size;
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}

class vehicle{
	private String registrationNo;
	private String chessisNo;
	int mktValue;
	String vehicleCategory;
	public String getRegistrationNo() {
		return registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}
	public String getChessisNo() {
		return chessisNo;
	}
	public void setChessisNo(String chessisNo) {
		this.chessisNo = chessisNo;
	}
	
}