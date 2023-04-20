package day02.exam02;

import java.util.Scanner;

public class yearsExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("태어난 해를 입력해 주세요 : ");
		int years = scan.nextInt();
		if (years%4 == 0) {	
			if(years%100 == 0) {
				if(years%400 == 0) {
					System.out.println("윤년 입니다");
				}else {
					System.out.println("평년입니다.");
				}
			} else {
				System.out.println("윤년입니다.");
			}
		} else {
			System.out.println("평년입니다.");
		}

	}

}
