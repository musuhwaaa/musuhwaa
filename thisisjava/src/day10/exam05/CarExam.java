package day10.exam05;

public class CarExam {

	public static void main(String[] args) {
		Car mc = new Car();
		mc.run();
		
		mc.tire1 = new KumhoTire();
		mc.tire2 = new KumhoTire();
		
		mc.run();

	}

}
