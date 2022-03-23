package model;

public class custmor {
	private String bankacccount;
	private String pasword;
	public custmor(String bankacccount, String pasword) {
		
		this.bankacccount = bankacccount;
		this.pasword = pasword;
	}
	
	public String getBankacccount() {
		return bankacccount;
	}
	public void setBankacccount(String bankacccount) {
		this.bankacccount = bankacccount;
	}
	public String getPasword() {
		return pasword;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}

}
