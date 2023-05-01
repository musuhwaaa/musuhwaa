package day07.exam03;

public class ShopServiceExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShopService obj1 = ShopService.get();
		ShopService obj2 = ShopService.get();
		if(obj1 == obj2) {
			System.out.println("같은 개체 입니다.");
		}else {
			System.out.println("다른 개체 입니다.");
		}
	}

}
