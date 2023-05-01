package day06.Exam02;

public class Carlulator {
	//필드 	-데이터저장
	//생성자	-필드의 초기화
	//메소드	-개체에 동작에 해당하는 코드 출력
	void powerOn() {
		System.out.println("전원킴");
	}
		
	int plus (int x, int y) {
		int result = x+y;
		return result;
	}
	double divide(int x, int y) {
		double result = (double) x / y;
		return result;
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
}
