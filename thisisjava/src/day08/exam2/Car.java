package day08.exam2;

public class Car {
	//필드선언
	public int speed;
	
	//메소드 선언
	public void speedUp() {
		speed += 1;
	}
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
	
	
	
}
