interface MyInterface {
	void method(); 
	default void newMethod(){}
}

public class InterfaceEx05 {
	public static void main(String[]args){
		//interface default, static method 추가 기능(jdk1.8)
		//인터페이스에 새로운 추상 메서드를 추가하기 어렵기 때문에 해결책이 default method 
		//default method 는 instance method 이기 때문에 dlscj
		//default method가 기존의 method와 충돌할 때의 헤결책 

		//1. 여러 인터페이스의 디폴트 메서드 간의 충돌 
		//	- 인터페이스를 구현한 클래스에서 디폴트 메서드를 오버라이딩 한다 
		//2. 디폴트 메서드와 조상 클래스 메서드 간의 충돌 
		// 	- 조상 클래스의 메서드가 상속되고 디폴트 메서드는 무시된다 
		
	}
}
