package day07.exam01;

public class Carulator {
	//정적 멤버 선언 static
	static double pi = 3.14159;
	static String company = "mycom";
	static String model = "LCD";
	static String info;
	//인스턴스 필드
	String color = "흰색";
	// 복잡한 값으로 정적 필드를 초기화 할 떄 정적 블럭을 사용
	static {
		info = company + "-" + model;
	}
	
	
	static int plus(int x, int y) {
		return x+y;
	}
	static int minus(int x, int y) {
		return x-y;
	}
	int divide(int x, int y) {
		return x/y;
	}
}
