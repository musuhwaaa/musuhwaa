package day07.exam03;

public class Ex15Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex15 ex=new Ex15();
		boolean re = ex.login("hong","12345");
		if(re) {
			System.out.println("로그인됐음");
			ex.logout("hong");
		}else {
			System.out.println("id 혹은 패스워드 틀렸삼");
		}
	}

}
