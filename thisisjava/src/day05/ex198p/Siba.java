package day05.ex198p;

import java.util.Scanner;

public class Siba {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] num = {10,30,20,50,60};
		System.out.println("숫자 두개 입력하셈");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int tmp;
		tmp = num[a];
		num[a] = num[b];
		num[b] = tmp;


		for(int i:num) {
			System.out.println(i);
		}

	}

}
