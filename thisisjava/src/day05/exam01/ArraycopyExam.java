package day05.exam01;

public class ArraycopyExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] oldstrArray = {"java", "array","copy"};
		String[] newstrArray = oldstrArray;
		oldstrArray[2] = "copycopy";
		System.out.println(newstrArray[2]);
		String[] newstrArray2 = new String[5];
		// null null null null null
		for(int i=0; i<oldstrArray.length; i++) {
			//newstrArray2[0] = "java"
			//newstrArray2[0] = "array"
			//newstrArray2[0] = copy"
			newstrArray2[i] = oldstrArray[i];
		}
		for(int i=0; i<newstrArray2.length; i++) {
		System.out.println(newstrArray2[i]);
		}
	}

}
