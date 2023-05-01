package day07.exam02;

public class CarExam {

	public static void main(String[] args) {
		// 객체생성
		Car mC = new Car();
		System.out.println(mC.getSpeed());
		mC.setSpeed(60);
		System.out.println(mC.getSpeed());
		System.out.println(mC.isStop());
		mC.setStop(true);
		System.out.println(mC.isStop());
		//멈춤
		if(!mC.isStop()) {
			mC.setStop(true);
		}
		System.out.println(mC.isStop());
	}

}
