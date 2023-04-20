package day02.exam01;
	import java.util.Scanner;
public class IfExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
		System.out.println("숫자를 입력하세요 : ");
		// String str = scan.nextLine();
		int number = Integer.parseInt(scan.nextLine());
		if(number%2==1) {
			System.out.println("홀수입니다");
		}else {
			System.out.println("짝수입니다");
		}
		if(number==100) {
			break;
		}
		
		System.out.println(number);
	}
	}
}
