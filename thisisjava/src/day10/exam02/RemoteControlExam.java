package day10.exam02;

public class RemoteControlExam {

	public static void main(String[] args) {
		//인터페이스 변수 선언 
		RemoteControl rc;
		
		//rc에 Televition
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(4);
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(7);
		rc.turnOff();
		
		rc.setMute(false);
		rc.setMute(true);
		rc.setMute(false);
		RemoteControl.changeBettery();
	}

}
