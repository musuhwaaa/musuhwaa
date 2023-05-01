package day10.exam03;

public interface Service {
	//디폴트 메소드
	default void defaultMethod1() {
		System.out.println("defualtMethod코드");
		a();

	}
	default void defaultMethod2() {
		System.out.println("defualtMethod코드");
		a();
		b();										////////둘다사용가능 정적이든 뭐든 
	}
	
	//정적메소드
	static void staticMethod1() {
		System.out.println("staticMethod코드");
		b();
	}
	static void staticMethod2() {
		System.out.println("staticMethod코드");
		b();										// private 정적 메소드만 호출 가능 / 그냥 프라이빗 메소드 호출 불가 !!!
	}
	
	//private 메소드
	private void a() {
		System.out.println("중복1");
		System.out.println("중복2");
	}
	private static void b() {
		System.out.println("중복1");
		System.out.println("중복2");
	}
}
