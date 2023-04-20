package day02.exam01;

import java.util.Scanner;

public class OperatorExam04 {

	public static void main(String[] args) {
		int charCode = 'd';
		if((charCode >= 65) && (charCode <= 90)) {
			System.out.println("대문자임");
		}
		if((charCode >= 97) && (charCode <=122)) {
			System.out.println("소문자이다");
	}
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 : ");
//		int n = Integer.parseInt(scan.nextLine());
		int n=0;
		n = sc.nextInt();
		
		if((n%2==0) && (n%3==0)) {
			System.out.println("2,3배수");
		}
		if((n%2==0) || (n%3==0)) {
			System.out.println("2, 혹은 3배수");
		}

		n = sc.nextInt();

		if((n%4==0) || (n%5==0)) {
			System.out.println("4,5배수");
		}
		
		int sco = 85;
		char gr = (sco > 90) ? 'A' : (sco > 80) ? 'B' : 'C';
		System.out.println(gr);
	}
}
}
