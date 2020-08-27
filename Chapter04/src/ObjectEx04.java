class Card {
	//인스턴스 변수 개별적인 속성 
	String kind ; // 무늬 
	int number ; // 숫자 
	
	
	//클래스 변수 공통적인 속성
	static int width = 100; //폭 
	static int height = 250; // 높이 
}


class Variable{
	
	int iv; // 인스턴스 변수  : 인스턴스가 생성되었을 때 
	static int cv; //클래스 변수 : 클래스가 메모리에 올라갈 떼 
	
	void method(){
		int lv; // 지역변수 : 변수 선언문이 수행되었을 때 
	}
}
public class ObjectEx04 {
	public static void main(String[]args){
		//선언 위치에 따른 변수의 종류 
		Card c1= new Card(); 
		c1.kind = "HEART";
		c1.number = 5; 
		
		Card c2 = new Card(); 
		c2.kind = "Spade";
		c2.number = 4; 

		System.out.println("Card.width:"+Card.width);
		System.out.println("Card.height:"+Card.height);
		System.out.println("c1은 "+c1.kind +", "+c1.number + "이며 크기는 ("+ c1.width +"/"+c1.height+ ")입니다");
		System.out.println("c2는 "+c2.kind +", "+c2.number + "이며 크기는 ("+ c2.width +"/"+c2.height+ ")입니다");
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다");
		c1.height = 50; 
		c1.width = 80 ; 
		System.out.println("c1은 "+c1.kind +", "+c1.number + "이며 크기는 ("+ c1.width +"/"+c1.height+ ")입니다");
		System.out.println("c2는 "+c2.kind +", "+c2.number + "이며 크기는 ("+ c2.width +"/"+c2.height+ ")입니다");
		//클래스변수의 경우 참조변수를 이용하기 보다는 클래스명을 이용한다 
	}
}
