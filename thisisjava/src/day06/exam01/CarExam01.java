package day06.exam01;
//실행 클래스
public class CarExam01 {
	//main메서드
	public static void main(String[] args) {
		//Car 객체 생성
		Car car1 = new Car();
		Car car2 = new Car("소나타");		//2번 생성자
		Car car3 = new Car("소나타", "흰색");		//3번 생성자
		Car car4 = new Car("소나xk타", "검정", 42);		//4번 생성자
		//car1 객체의 필드 출력 하기. model, speed, start
		System.out.println("모델명 " + car2.model);
		System.out.println("모델명 " + car2.color);
		System.out.println("모델명 " + car2.maxspeed);
		System.out.println("모델명 " + car2.company);
		System.out.println();
		
		System.out.println("모델명 " + car3.model);
		System.out.println("모델명 " + car3.color);
		System.out.println("모델명 " + car3.maxspeed);
		System.out.println("모델명 " + car3.company);
		
		System.out.println();
		System.out.println("모델명 " + car4.model);
		System.out.println("모델명 " + car4.color);
		System.out.println("모델명 " + car4.maxspeed);
		System.out.println("모델명 " + car4.company);
		
//		//car 객체의 필드값 변경.
//		car1.speed = 80;
//		System.out.println("모델명 " + car1.speed);
		
	}

}
