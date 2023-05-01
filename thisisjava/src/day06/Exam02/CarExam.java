package day06.Exam02;

public class CarExam {

	public static void main(String[] args) {
		//객체 생성
		Car Ca = new Car();
		
		//gas 필드값을 10으로 변경
		Ca.setGas(10);
		
		if(Ca.isLeftGas()) {
			System.out.println("출발합니다.");
			Ca.run();
		}
		System.out.println("gas를 주입해 주세요");
		
	}

}
