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
			System.out.println("�ܾ� ����");
			return;
		}
		money -=p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "�� �����߽��ϴ�");
	
	}
}



public class PolymorphismEX02 {
	public static void main(String[]args){
		//�Ű������� ������ 
		//������ �Ű������� �޼��� ȣ��� �ڽŰ� ���� Ÿ�� �Ǵ� �ڼ� Ÿ���� �ν��Ͻ���  �Ѱ��� �� �ִ� 
		Buyer b = new Buyer(); 
		b.buy(new Tv03());
		b.buy(new Audio03());
		b.buy(new Computer03());
		
		System.out.println("���� ���� ���� "+ b.money +"�� �Դϴ�");
		System.out.println("���� ������ ����Ʈ��"+ b.bonusPoint +"�� �Դϴ�");
	}
}
