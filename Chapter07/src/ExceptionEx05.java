
public class ExceptionEx05 {
	public static void main(String[]args){
		//���� �߻���Ű�� 
		//1. ������ new �� �̿��ؼ� �߻���Ű���� ���� Ŭ������ ��ü�� ���� ����
		//	 Exception e = new Exception("���Ƿ� ���� �߻�");
		//2. Ű���� throw�� �̿��ؼ� ���ܸ� �߻���Ų�� 
		//	 throw e ; 
		
		try {
			Exception e = new Exception("���Ƿ� ���� �߻�");
			throw e ;  //���ܸ� �߻���Ŵ 
			
		} catch (Exception e) {
			System.out.println("Error Message " +e.getMessage());
			e.printStackTrace();
		}
		System.out.println("���α׷��� ���� ����Ǿ���");
		
		
	
	}
}
