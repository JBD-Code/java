/*
class A {
	B b = new B(); 
	int i=100; 
} 
class B {
	void method(){
		A a = new A(); 
		System.out.println(a.i);
	}
	
}
*/ 
class A {
	B b = new B(); 
	int i=100; 

	class B {
		void method(){
			//A a = new A(); 
			//System.out.println(a.i);
			System.out.println(i);
		}

} 
	
}
class C {} 


public class InnerClassEx01 {
	public static void main(String[]args){
		//inner class 
		//클래스 안의 클래스 
		//내부 클래스의 장점 
		//1. 내부 클래스에서 객체 생성 없이 외부 클래스의 멤버로 접근이 가능하다 
		//2. 코드의 복잡성을 줄일 수 있다 (캡슐화)

		//B b = new B();
		//b.method();
		
		A a = new A();
		System.out.println(a.i);
		
		//내부클래스의 종류와 scope는 변수와 동일하다 
		
		
	}
}
