package day05.exam01;

public class ArrayExam {

	public static void main(String[] args) {
		int[] nums = { 10,20,30};
		System.out.println(nums[0]);
		nums[0] = 100;
		
		String[] strs = {"그린","레드","블루"};
		for(int i=0; i<3; i++) {
			System.out.println(strs[i]);
		}
		
		int[] nums2 = new int[5];
		for(int i=0; i<nums2.length; i++) {
			nums2[i] = i+1;
		}
		int arrlen = nums.length;
		System.out.println(arrlen);
		
	}

}
