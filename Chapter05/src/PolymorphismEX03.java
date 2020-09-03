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
			System.out.println("�ܾ׺���");
			return; 
		}
		money -=p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "�� �����߽��ϴ�");
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
		System.out.println("������ ��ǰ�� �� �ݾ��� "+ sum+ "�Դϴ�");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�");
		
	}
}
public class PolymorphismEX03 {
	public static void main(String[]args){
		//������ ���������� ��ü�� �迭�� �ٷ�� 
		//����Ÿ���� �迭�� �ڼյ��� ��ü�� ���� �� �ִ� 
		Buyer01 b = new Buyer01();
		b.buy(new Tv04());
		b.buy(new Computer04());
		b.buy(new Audio04());
		b.summary();
		
	
	}
}
