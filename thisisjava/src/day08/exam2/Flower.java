package day08.exam2;

public class Flower {
	String name;
	int cost;
	
	public Flower(String name, int cost) {
		this.name = name;
		this.cost = cost;
		
	}
	public void flowerlnformation() {
		System.out.println(name+ " 1송이의 가격은 "+cost + "입니다.");
	}
}
