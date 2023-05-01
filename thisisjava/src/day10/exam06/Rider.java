package day10.exam06;

public class Rider {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi =  new Taxi();
		
		//매개값으로 구현 객체 대입 *(다형성으로 실행 결과가 다름)
		//자동타입변환 -> 오버라이딩 메소드 호출 -> 다형성 
		driver.drive(taxi);
		driver.drive(bus);

	}

}
