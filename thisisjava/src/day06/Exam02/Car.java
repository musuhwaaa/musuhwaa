package day06.Exam02;

public class Car {
	//필드선언
	int gas;
	
	//매개값을 받아서 gas필드값을 변경
	void setGas(int gas) {
		this.gas = gas;
	}
		
	// 리턴값이 boolean 타입인 메소드로 gas필드값이 0이면
	// false, 0이 아니면 true를 리턴 
		boolean isLeftGas() {
			if (gas==0) {
				System.out.println("gas가 없습니다 ");
				return false;
			}else {
				System.out.println("gas가 있습니다 ");
				return true;
			}
		}
		//리턴값이 없는 메소드로 gas필드 값이 0이면 메소드를 종료 0아니면 gas를 계속 1씩 감소
		void run() {
			while(true) {
				if(gas>0) {
					System.out.println("달립니다.(가스잔량 : "+gas+")");
					gas -= 1;
				}else {
					System.out.println("멈춥니다. (가스잔량 : "+ gas+")");
					return;
				}
			}	
		}
}
