package day07.exam03;

public class Account2 {
	private String accountNum;		//계좌번호
	private String accountName;		//계좌주
	private	int balance;			//잔고
	
	public Account2() {
		
	}	
	public Account2(String accountNum, String accountName, int balance) {
		this.accountNum = accountNum;
		this.accountName = accountName;
		this.balance = balance;
	}
	
	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
}
