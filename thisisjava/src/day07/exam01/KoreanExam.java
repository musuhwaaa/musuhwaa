package day07.exam01;

public class KoreanExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korean k1 = new Korean("123456","아무개");
		k1.name = "개무개";
//		final 필드는 값을 변경할 수 없다
//		k1.nation = "usa";
//		k1.ssn =  "dflknaekfns";
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
				
	}

}
