package day06.exam01;

public class Tv {
	public String brand = "";
	public boolean onoff = false;
	public int ch = 0;
	public int vol = 10;
	//생성자
	public Tv(String brand) {
		this.brand = brand;
	}
	//메소드
	//1. 전원 켜다
	void power() {
		if(this.onoff = true) {
		System.out.println("전원이 켜집니다.");
		}else {
			System.out.println("전원이 꺼집니다.");
		}
	}

	void channelUp() {
		ch++;
		System.out.println(ch);
	}
	void channelDown() {
		ch--;
		System.out.println(ch);
	}
	void volumeUp() {
		vol++;
		System.out.println(vol);
	}
	void volumeDown() {
		vol--;
		System.out.println(vol);
	}
	
	
	
}
