class Product{
	int price; 
	int bonusPoint; 
	
	Product (int price){
		this.price = price; 
		bonusPoint = (int)(price/10.0);
	}
}

class Tv03 extends Product{
	Tv03(){
		super(100);
	}
	
	public String toString(){
		return "Tv03";
	}
}
class Computer03 extends Product{
	Computer03() {
		super(200);
	}
	public String toString(){
		return "Computer03";
	}
}
class Audio03 extends Product{
	Audio03(){
		super(400);
	}
	public String toString(){
		return "Audio03";
	}
}
class Buyer {
	int money=1000;
	int bonusPoint=0;
	
	//void buy(Tv03 t){
	//	money -= t.price;
	//	bonusPoint +=t.bonusPoint;
	//}
	//void buy(Computer03 c){
	//	money -= c.price;
	//	bonusPoint +=c.bonusPoint;
	//}
	//void buy(Audio03 a){
	//	money -= a.price;
	//	bonusPoint +=a.bonusPoint;
	//}
	void buy(Product p){
	
		if(money<p.price){
			System.out.println("잔액 부족");
			return;
		}
		money -=p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "를 구입했습니다");
	
	}
}



public class PolymorphismEX02 {
	public static void main(String[]args){
		//매개변수의 다형성 
		//참조형 매개변수는 메서드 호출시 자신과 같은 타입 또는 자손 타입의 인스턴스를  넘겨줄 수 있다 
		Buyer b = new Buyer(); 
		b.buy(new Tv03());
		b.buy(new Audio03());
		b.buy(new Computer03());
		
		System.out.println("현재 남은 돈은 "+ b.money +"원 입니다");
		System.out.println("현재 적립된 포인트는"+ b.bonusPoint +"점 입니다");
	}
}
