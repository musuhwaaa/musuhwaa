package day09.exam05;

import java.util.Scanner;

public class TireExam {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i = 1; i<15; i++) {
			//문제 없으면 0, 앞 왼쪽 펑크 1, 앞오 펑크 2, 뒤 왼 펑3, 뒤 오 펑4
			int problemLocation = car.run();
			switch(problemLocation) {
			case 1:
				System.out.println("앞 왼쪽 한국 타이어 교체");
				car.fl = new HankookTire("앞 왼쪽", 5);
				break;
			case 2:
				System.out.println("앞 오른쪽 금호 타이어 교체");
				car.fr = new KumhoTire("앞 오른쪽", 5);
				break;
			case 3:
				System.out.println("뒤 왼쪽 한국 타이어 교체");
				car.fll = new HankookTire("뒤 왼쪽", 5);
				break;
			case 4:
				System.out.println("뒤 오른쪽 금호 타이어 교체");
				car.frr = new KumhoTire("뒤 오른쪽", 5);
				break;
			}
			System.out.println("----------------------------------");
		}

	}

}
