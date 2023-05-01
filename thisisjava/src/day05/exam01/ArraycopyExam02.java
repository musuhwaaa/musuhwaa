package day05.exam01;

import java.util.Iterator;

public class ArraycopyExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] oldnums = {10,20,30};
		int[] newnums = new int[5];
		System.arraycopy(oldnums, 0, newnums, 0, 3);
		for(int i=0; i<newnums.length; i++) {
			System.out.print(newnums[i] + " ");
		}
		System.out.println();
		for(int i:newnums) {
			System.out.print(i+ " ");
		}
		System.out.println();
		String[] str1 = {"가","나","다","라","마"};
		for (String i:str1) {
			System.out.print(i + " ");
		}
		int[] scores = {95,71,84,93,97};
		int sum = 0;
		System.out.println();
		for (int i:scores) {
			System.out.print(i+ " ");
		}

	}

}
