package day07.exam03;

public class Ex15 {
	String id;
	String password;
	
	
	public boolean login(String id, String password) {
		this.id=id;
		this.password=password;
		if(id.equals("hong")&&password.equals("12345")) {
				return true;
			}else {
				return false;
			}
		
		}
	public void logout(String id) {
		System.out.println("로그아웃되었ㅅ브니다.");
	}

}