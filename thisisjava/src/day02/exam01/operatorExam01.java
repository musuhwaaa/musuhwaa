package day02.exam01;

public class operatorExam01 {

	public static void main(String[] args) {
		//단항연산자
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1 : " + result1);
		System.out.println("result1 : " + result2);
		
		//int보다 작은 타입의 변수는 부호연산시 int로 자동타입변환
		byte b = 100;
		int result3 = -b;
		System.out.println(result3);

		
		System.out.println("----------------------");
		//증감 연산자
		int num1 = 10;
		int num2 = 20;
		int num3;
		int num4;
		num3 = num2++;
		num3 = num2++;
		num4 = ++num2;
		System.out.println(num3);
		System.out.println(num4);
	
	}

}
