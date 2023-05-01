package day10.exam02;

public interface RemoteControl {
	//상수필드 STATIC FINAL이 생략됨
	//상수임
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상메소드 abstract생략
	//추상메소드임
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("무음 해지합니다.");
		}
	}
	
	//정적메소드
	static void changeBettery() {
		System.out.println("리모컨 건전지를 교체합니다.");
	}
	
}
