package day03.exam01;

public class WhileEx04 {

	public static void main(String[] args) {
		int num = 0;

		while (true) {
			int random1 = (int)(Math.random()*7);
			int random2 = (int)(Math.random()*7);
			System.out.println(random1);
			System.out.println(random2);
			if(random1 + random2 ==5) {	
			break;}

		}

	}

}
