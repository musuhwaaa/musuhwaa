package day01.exam02;

public class OperationExam {
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		int result = byteValue1 + byteValue2;
		
		char charValue1 = 'A';
		char charValue2 = 1;
		int intResult = charValue1 + charValue2;
		
		byte byteResult = 10 + 20;
		long value1 = 1000L;
		int value2 = 200;
		long longValue1 = value1 + value2;
		
		double doubleValue = 31.14346;
		int intValue4 = 30;
		double doubleResult = doubleValue + intValue4;  
		
		double d = 5 / 3.0;
		System.out.println(d);
		
		int money = 1238;
		money = money / 10 + 10 * 10 ;
		System.out.println(money);
		
		int x = 1;
		int y = 2;
		double result3 = x / (double)y;
		System.out.println(result3);
		
		System.out.println(result);
		System.out.println(intResult);
		System.out.println(longValue1);
		System.out.println(doubleResult);
	}

}
