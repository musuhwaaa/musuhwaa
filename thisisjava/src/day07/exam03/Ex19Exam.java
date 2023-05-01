package day07.exam03;

public class Ex19Exam {

	public static void main(String[] args) {
		
		Ex19 account = new Ex19();

		account.setBalance(10000);
		System.out.println("현재 잔고 : "+ account.getBalance());
		
		account.setBalance(400);
		System.out.println("현재 잔고 : "+ account.getBalance());
	}

}
