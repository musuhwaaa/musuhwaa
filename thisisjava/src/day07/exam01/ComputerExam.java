package day07.exam01;

import java.util.Scanner;

public class ComputerExam {

	public static void main(String[] args) {
		// Computer 객체 생성
		Computer mC = new Computer();
		
		
		//sum() 메소드 호출 시 합산결과를 리턴받아서 result1에 할당
		int result1 = mC.sum(1,2,3);
		int result2 = mC.sum(5,6,7,8,9,10);
		int[] nums = {1,2,3,4,5};
		int result3 = mC.sum(nums);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		double aa = mC.areaRectangle(3.2,2.5);
		System.out.println(aa);
					
		
	}

}
