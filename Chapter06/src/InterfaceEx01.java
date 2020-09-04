interface Moveable{
	void move(int x, int y); 
}

interface Attackable{
	void attack(Unit u);
}

public interface InterfaceEx01 extends Moveable, Attackable{
	//interface 
	//추상 메서드의 집합 
	//구현 된 것이 없는 설계도(모든 멤버가 public) 
	//public static final 타입 상수이름 = 값 ;
	//public abstract 메서드이름( 매개변수 목록); 
	
	public static final int SPADE = 4; 
	final int DIAMOND = 3 ; 
	static int HEART = 2;
	int CLOVER =1; 
	
	public abstract String getCardNumber(); 
	String getCardKind();
	//public, static, final 생략이 가능 
	//인터페이스의 조상은 인터페이스만 가능하다 (Object가 최고 조상이 아니다) 
	//다중 상속이 가능하다 조상을 여러개 가질 수 있다 
	
	//interface의 구현 
	//인터페이스에 정의된 추상 메서드를 완성하는 것 
	//class 클래스이름 implements 인터페이스 이름 { 
		//인터페이스에 정의된 추상메서드를 모두 구현 해야 한다 

	//}
	
	//추상클래스와 인터페이스의 공통점은 추상 메서드를 가지고 있으며 미완성의 설계도이다 
	//추상클래스와 인터페이스의 차이점은 iv를 가질수 있는가 없는가이다 
	
}

class Fighter implements InterfaceEx01 {

	@Override
	public void attack(Unit u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getCardNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCardKind() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
