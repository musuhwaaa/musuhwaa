package day07.exam03;

public class ShopService {
	
	//String name = new String("앙뇽");
	private static ShopService shopService = new ShopService(); //정적 필드임 외부접근 불가능
	
	//ShopService.shopService
	private ShopService() {
		
	}
	
	//메소드 
	//리턴타입이 있냐없냐
	static ShopService get() {
		return shopService;
	}
}
