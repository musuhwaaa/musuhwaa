package day08.exam2;

public class Cat extends Animal {
	String name;
	int age;
	
	public Cat(String name, int age) {
		//super 가 생략 되있음
		this.name = name;
		this.age = age;
		this.kind = "고냥이";
	}
	@Override
	public void sound() {
		super.sound();
		System.out.println("냐옹냐옹");
	}


		
	
	
}
