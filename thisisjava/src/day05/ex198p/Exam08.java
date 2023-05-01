package day05.ex198p;

public class Exam08 {

	public static void main(String[] args) {
		// 전체 합과 평균을 구해라
		int[][] array = {
				{95, 86},
				{83,92,96},
				{78,83,93,87,88}
		};
		int sum = 0;
		double avg = 0.0;
		int leng = 0;
		for(int[] arr : array) {
			for(int a:arr) {
				sum += a;
			}
			leng += arr.length;
		}
		avg = sum/(double)leng;
		System.out.println("총 합은 : "+sum);
		System.out.println("평균은 : "+avg);
	}

}
