package day07.exam03;

public class SingletonExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton obj1 = Singleton.getInstacne();
		Singleton obj2 = Singleton.getInstacne();
		
		//동일한 객체인지 참조확인
		if(obj1==obj2) {
			System.out.println("같은 객체임");
		}else {
			System.out.println("다른객체임");
		}
		

	}

}
