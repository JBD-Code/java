
public class ExceptionEx10 {
	public static void main(String[]args){
		//���� �Ǵ����� (Exception re-throwing) 
		//���ܸ� ó���� �� �ٽ� ���ܸ� �߻���Ű�� �� 
		//ȣ���� �޼���� ȣ��� �޼��� ���� ��ο��� ���ܸ� ó���ϴ� �� 
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main �޼��忡�� ���ܰ� ó�� �Ǿ����ϴ�");
			e.printStackTrace();
		}
	}
	static void method1() throws Exception {
		try {
			throw new Exception(); //���� �߻�
		}catch (Exception e) {
			System.out.println("method1 �޼��忡�� ���ܰ� ó�� �Ǿ����ϴ�");
			//try - catch �� ���� ó�� 	
			throw e;  // �ٽ� ���� �߻����Ѽ� main �޼���� ����  
		}
	}
}
