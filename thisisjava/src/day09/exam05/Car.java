package day09.exam05;

public class Car {
	Tire fl = new Tire("앞 왼쪽", 10);
	Tire fr = new Tire("앞 오른쪽", 6);
	Tire fll = new Tire("뒤 왼쪽", 4 );
	Tire frr = new Tire("뒤 오른쪽", 12);
	
	int run() {
		System.out.println("자동차가 달립니다.");
		if(fl.roll()==false) {
			stop();
			return 1;
		}
		if(fr.roll()==false) {
			stop();
			return 2;
		}
		if(fll.roll()==false) {
			stop();
			return 3;
		}
		if(frr.roll()==false) {
			stop();
			return 4;
		}
		return 0;
	}
	void stop() {
		System.out.println("자동차가 멈춤.");
	}
}
