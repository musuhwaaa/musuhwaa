package day08.exam2;

public class Rose extends Flower {
	String name2;
	
	public Rose(String name, int cost, String name2) {		
		super(name,cost);		
		this.name2 = name2;
	}

	
	public void flowerlnformation() {
		System.out.println(name+ " 1송이의 가격은 "+cost + "입니다."+name2);
	}

}
