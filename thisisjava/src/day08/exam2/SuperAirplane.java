package day08.exam2;

public class SuperAirplane extends Airplane {
	public int flyMode = 1;
	
	public void fly() {
		if(flyMode==2) {
			System.out.println("조용히 이륙함~");
		}else {
			super.fly();
		}
	}
}
