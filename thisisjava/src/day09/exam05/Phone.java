package day09.exam05;

//추상 클래스
public abstract class Phone {
	//추상 메소드는 추상 클래스 에서만 쓸 수 있다
	//필드 선언
	String owner;
	
	//생성자 선언
	Phone(String owner){
		this.owner=owner;
	}
	
	//메소드 선언
	void turnOn() {
		System.out.println("폰 전원 킴");
	}
	void turnOff() {
		System.out.println("폰 전원 끔");
	}
	abstract void send(String message); //추상메소드는 실행 블록을 가지지 않음.
	
}
