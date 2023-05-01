package day08.exam2;

public class AirplaneExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperAirplane a = new SuperAirplane();
		a.takeOff();
		a.fly();
		a.flyMode = 2;
		a.fly();
		a.flyMode=1;
		a.land();
	}

}
