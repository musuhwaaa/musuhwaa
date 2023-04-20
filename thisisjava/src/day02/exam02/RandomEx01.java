package day02.exam02;

import java.util.Scanner;

public class RandomEx01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("무엇을 내실 건가요 ? :");
		String rsp = scan.nextLine();
		System.out.println(rsp + " 를 내셨습니다.");
		int sis = 0;
		
		if(rsp.equals("가위")) {
			sis = 0;
		}
		if(rsp.equals("바위")) {
			sis = 1;
		}
		if(rsp.equals("보")) {
			sis = 2;
		} 
		
		int random = (int)(Math.random()*3);
		if(random == 0) {
			System.out.println("컴퓨터는 가위를 냈습니다");
		} else if (random ==1) {
			System.out.println("컴퓨터는 바위를 냈습니다");
		} else if (random ==2) {
			System.out.println("컴퓨터는 보를 냈습니다");}
		if(random==sis) {
			System.out.println("비겼습니다.");
		} else if((sis-random)==1 || (sis-random)==-2){
			System.out.println("당신이 이겼습니다.");
		} else if((random-sis)==1 || (random-sis)==-2) {
			System.out.println("당신이 졌습니다.");
		}
	}
}

//int random = (int)(Math.random()*3);

//if(rsp.equals("가위")&&random==0 || rsp.equals("바위")&&random==1 || rsp.equals("보")&&random==2) {
//	//비겼을때
//	if(rsp.equals("가위")) {
//		System.out.println("컴퓨터:가위, 유저:가위 비겼습니다.");
//	}else if(rsp.equals("바위")) {
//		System.out.println("컴퓨터:바위, 유저:바위 비겼습니다.");
//	}else {
//		System.out.println("컴퓨터:보, 유저:보 비겼습니다.");
//	}
//} else {
//	0 = 가위 1 = 바위 2=보
//}
