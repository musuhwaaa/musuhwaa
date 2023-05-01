package day10.ex01;

public class Aa  {
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSound(new Cat());
	}

}
