package day06.exam01;
//라이브러리 클래스(객체의 설계도)
public class Car {
	//필드 선언
	public String company = "현대자동차";
	public String model;
	public String color;
	public int speed;
	public int maxspeed;
	public boolean start;
	
	//생성자 선언 기본 생성자
	//생성자 오버로딩 : 매개 변수의 타입, 갯수, 순서가 다른 생성자를 여러개 작성.
	// 목적 : 객체의 필드를 다양하게 초기화 할 수 있음.
	public Car() {
	}
	
	public Car(String model) {
		this(model, "흰색");
	}
	
	public Car(String model, String color) {
//		this.model = model;	
//		this.color = color;
		this(model, color, 200);   //4번 생성자
	}
	
	//생성자 선언         Car car1 = new Car(~~,~~);
	public Car (String model, String color, int maxspeed) {
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
	}
}
