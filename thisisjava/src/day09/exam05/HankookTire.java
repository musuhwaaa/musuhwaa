package day09.exam05;

public class HankookTire extends Tire {
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	@Override
	public boolean roll() {
		++accumulatedRotation;
		//누적 회전수를 1씩 증가
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "한국 타이어 수명"+(maxRotation-accumulatedRotation));
			return true;
		}else {
			System.out.println("***"+location+"타이어 펑크남");
			return false;
		}
	}
}
