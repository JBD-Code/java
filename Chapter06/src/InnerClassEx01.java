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
		//Ŭ���� ���� Ŭ���� 
		//���� Ŭ������ ���� 
		//1. ���� Ŭ�������� ��ü ���� ���� �ܺ� Ŭ������ ����� ������ �����ϴ� 
		//2. �ڵ��� ���⼺�� ���� �� �ִ� (ĸ��ȭ)

		//B b = new B();
		//b.method();
		
		A a = new A();
		System.out.println(a.i);
		
		//����Ŭ������ ������ scope�� ������ �����ϴ� 
		
		
	}
}
