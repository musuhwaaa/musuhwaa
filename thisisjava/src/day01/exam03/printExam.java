package day01.exam03;

public class printExam {

	public static void main(String[] args) {
		//System.out 표준출력장치
		System.out.print("안녕");
		System.out.print("안녕");
		System.out.print("안녕");

		
		System.out.println("안녕");
		System.out.println("안녕");
		System.out.println("안녕");
		System.out.println("안녕");

		System.out.printf("내 이름은 %s 이다 나이는 %d 이다.", "김그린", 25);
		System.out.printf("이름 : %-10s , 나이 : %2$05d ,", "abc", 20, "abcd");
		System.out.println();
		System.out.printf("%104f", 12.1542123);
	}

}
