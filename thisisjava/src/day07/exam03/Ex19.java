package day07.exam03;

public class Ex19 {
	//인스턴스 필드 : 잔고
	private int balance;
	//상수 , 정적 필드
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 100000000;
	
	public int getBalance() {
		return this.balance;
	}
	public void setBalance(int balance) {
		//잔고값을 수정할 때 수정값이 0보다 작은 음수 이거나 1000000보다 크면 원래 있던 간고값으로 지정
		if(balance >= Ex19.MIN_BALANCE && balance <= Ex19.MAX_BALANCE) {
			this.balance = balance;
		}
		//this.balance = balance >= Ex19.MAX_BALANCE && balance<= Ex19.MIN_BALANCE ? balance : this.balance;
	}
	public static int getMinBalance() {
		return MIN_BALANCE;
	}
	public static int getMaxBalance() {
		return MAX_BALANCE;
	}
	
	
}
