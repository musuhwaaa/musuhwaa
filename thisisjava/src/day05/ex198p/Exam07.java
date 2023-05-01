package day05.ex198p;

public class Exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,5,3,8,2};
		int max = array[0];
		
		for(int i = 1; i<array.length; i++) {
//			max값보다 해당배열요소값이 더 크면 그 값을 max 에 할당
//			아니면 max값을 max할당
			max = max < array[i] ? array[i] : max;
			if(max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("최대값은 : "+max);
	}

}
