package day10.exam03;

public class CC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus bus1 = new Bus();
		bus1.c();
		bus1.run();
		//자동타입변환
		Vehice bus2 = new Bus();
		bus2.run();
//		bus2.c();못씀
		//강제타입변환
		Bus bus3 = (Bus) bus2;
		bus3.c();
	}

}
