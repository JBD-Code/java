
public class ExceptionEx04 {
	public static void main(String[]args){
		//printStackTrace() getMessage() 
		//printStackTrace() 
		//���� �߻� ����� ȣ�� ���ÿ� �־��� �޼����� ������ ���ܸ޽����� ȭ�鿡 ��� 
		//getMessage() 
		//�߻��� ���� Ŭ������ �ν��Ͻ��� ����� �޽����� ���� �� �ִ� 
		
		System.out.println(1);
		System.out.println(2);
		try{
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
			
		}catch (ArithmeticException ae) {
			ae.getStackTrace();
			System.out.println("Exception Message" + ae.getMessage());
		}
		System.out.println(5);
		
	}
}
