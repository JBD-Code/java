interface MyInterface {
	void method(); 
	default void newMethod(){}
}

public class InterfaceEx05 {
	public static void main(String[]args){
		//interface default, static method �߰� ���(jdk1.8)
		//�������̽��� ���ο� �߻� �޼��带 �߰��ϱ� ��Ʊ� ������ �ذ�å�� default method 
		//default method �� instance method �̱� ������ dlscj
		//default method�� ������ method�� �浹�� ���� ���å 

		//1. ���� �������̽��� ����Ʈ �޼��� ���� �浹 
		//	- �������̽��� ������ Ŭ�������� ����Ʈ �޼��带 �������̵� �Ѵ� 
		//2. ����Ʈ �޼���� ���� Ŭ���� �޼��� ���� �浹 
		// 	- ���� Ŭ������ �޼��尡 ��ӵǰ� ����Ʈ �޼���� ���õȴ� 
		
	}
}
