package day08.exam;

public class Phone {
	//필드선언
	public String model;
	public String color;
	//기본생성자 선언
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println("phone생성자 실행");
	}
	//메소드 선언
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	public void sendVoice(String message) {
		System.out.println("message");
	}
	public void recedVoice(String message) {
		System.out.println("message");
	}
	public void hangup(String message) {
		System.out.println("저나끊을거얌");
	}
}
