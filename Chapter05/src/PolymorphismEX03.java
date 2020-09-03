class Product01{
	int price; 
	int bonusPoint;
	
	Product01(int price) {
		this.price = price; 
		bonusPoint = (int)(price/10.0);
	}
}
class Tv04 extends Product01{
	
	Tv04(){
		super(100);
	}
	public String toString(){
		return "Tv";
	}
}
class Computer04 extends Product01{
	
	Computer04() {
		super(200);
	}
	public String toString(){
		return "Computer";
	}
}
class Audio04 extends Product01{
	Audio04(){
		super(150);
	}
	public String toString(){
		return "Audio";
	}
	
}

class Buyer01 {
	int money = 1000; 
	int bonusPoint = 0;
	Product01[] cart = new Product01[4];
			
	int i = 0; 
	void buy(Product01 p){
		if(money < p.price){
			System.out.println("잔액부족");
			return; 
		}
		money -=p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "를 구입했습니다");
		cart[i++]= p;
	}
	
	void summary(){
		int sum = 0;
		String itemList = "";
		
		for(int i=0; i<cart.length; i++){
			if(cart[i]==null) break; 
				sum+=cart[i].price;
				itemList += cart[i]+ ",";
		}
		System.out.println("구입한 물품의 총 금액은 "+ sum+ "입니다");
		System.out.println("구입하신 제품은 " + itemList + "입니다");
		
	}
}
public class PolymorphismEX03 {
	public static void main(String[]args){
		//다형성 여러종류의 객체를 배열로 다루기 
		//조상타입의 배열에 자손들의 객체를 담을 수 있다 
		Buyer01 b = new Buyer01();
		b.buy(new Tv04());
		b.buy(new Computer04());
		b.buy(new Audio04());
		b.summary();
		
	
	}
}
