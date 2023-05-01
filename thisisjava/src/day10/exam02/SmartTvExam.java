package day10.exam02;

public class SmartTvExam {

	public static void main(String[] args) {
		// 인터페이스 변수			ㅇㄹㄴㅇㄹ				ㅇㄴㄹ
		RemoteControl rc = new SmartTv();
		Searchable sc = new SmartTv();
		
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		sc.search("naver.com");
		
	}

}
