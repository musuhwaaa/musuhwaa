package day08.exam;

public class SmartPhone extends Phone{
	//필드 선언
	public boolean wifi;
	public String company;
	//생성자 선언
	public SmartPhone(String model, String color) {
//		super();	//부모 생성자 호출 -->생략가능함(컴파일시 자동추가)
//		this.model = model;		//phone로 부터 상속
//		this.color = color;		//phone로 부터 상속	
		super(model, color);	//-->매개변수가 있는 생성자일 경우 부모 생성자 생략 안됨
	}
	public SmartPhone(String model, String color, String company) {
		super(model, color);
		this.company=company;
	}
	//메소드 선언
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
	}
	public void internet( ) {
		System.out.println("인터넷에 연결합니다.");
	}
}
