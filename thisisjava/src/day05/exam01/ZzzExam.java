package day05.exam01;
import java.util.Scanner;
public class ZzzExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("5개의 숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5]; 
		for(int i=0; i<num.length; i++) {
			System.out.println(i+1 +"번째 숫자를 입력하세요 : ");
			num[i]=scan.nextInt();	
		}
		//내림차순정렬
		int tmp = 0;
		//10 20 30 40 50 --> 50 40 30 20 10 
		for(int i=0; i<num.length; i++) {
			for(int j = i+1; j<num.length; j++) {
				if(num[i] < num[j]) {
					tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
		}
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");
		}

		
}
}


