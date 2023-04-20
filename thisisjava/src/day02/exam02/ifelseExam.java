package day02.exam02;

public class ifelseExam {

	public static void main(String[] args) {
		int score=80;
//		if(score>=90) {
//			System.out.println("A");
//		} else if(score>=80) {
//			System.out.println("B");
//		} else if(score>=70) {
//			System.out.println("C");
//		} else if(score>=60) {
//			System.out.println("D");
//		}
//		double dRandom = Math.random()*3;
//		System.out.println(dRandom);
		int iRandom = (int)(Math.random()*5)+1;
//		if(iRandom==1) {
//			System.out.println("1입니다.");
//		}	else if(iRandom==2) {
//			System.out.println("2입니다.");
//		}	else if(iRandom==3) {
//			System.out.println("3입니다.");
//		}	else if(iRandom==4) {
//			System.out.println("4입니다.");
//		}	else if(iRandom==5) {
//			System.out.println("5입니다.");
//		} 
//		System.out.println(iRandom);
		
		switch(iRandom) {
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
		case 4:
			System.out.println("4입니다.");
			break;
		default:
			System.out.println("다아님");
			
		}
	}

}
