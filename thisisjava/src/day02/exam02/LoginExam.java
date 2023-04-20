package day02.exam02;

import java.util.Scanner;

public class LoginExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디를 입력해 주세요 : ");
		String userId = scan.nextLine();
		System.out.println();
		
		System.out.print("비밀번호 : ");
		String userPass = scan.nextLine();
		System.out.println();
		
		if(userId.equals("green") && userPass.equals("1234")) {
			System.out.println("로그인 되었습니다.");
		} else {
			System.out.println("로기인실패");
		}
	

	}
}
