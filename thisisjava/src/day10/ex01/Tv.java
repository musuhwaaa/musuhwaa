package day10.ex01;

public class Tv implements Remocon {

	
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("zz");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remocon r = new Tv();
		r.powerOn();
	}

}
