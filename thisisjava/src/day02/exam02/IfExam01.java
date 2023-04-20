package day02.exam02;
import java.util.Scanner;
public class IfExam01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요 : ");
		int number = scan.nextInt();
		if(number%3==0) {
			System.out.println(number + "은 3의 배수입니다.");
		}
		if(number%5==0) {
			System.out.println(number + "은 5의 배수입니다.");
		}
		

	}

}
