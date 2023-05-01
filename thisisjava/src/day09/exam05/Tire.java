package day09.exam05;

public class Tire {
	//필드
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	//메소드
	public boolean roll() {
		++accumulatedRotation;
		//누적 회전수를 1씩 증가
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "타이어 수명"+(maxRotation-accumulatedRotation));
			return true;
		}else {
			System.out.println("***"+location+"타이어 펑크남");
			return false;
		}
	}
}
