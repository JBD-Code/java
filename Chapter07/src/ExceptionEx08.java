
public class ExceptionEx08 {
	public static void main(String[]args) throws Exception {
		//method�� ���� �����ϱ� 
		//���ܸ� �����ϴ� ���  
		//1. try-catch 
		//2. ���� �����ϱ� 
		//3. ���� �ϱ�(����) 
		//�޼��尡 ȣ��� �߻������� ���ܸ� ȣ���ϴ� �ʿ� �˸��� �� 
		method1();
	}
	static void method1() throws Exception {
		method2();
	}
	
	static void method2() throws Exception {
		throw new Exception();
	}
}
