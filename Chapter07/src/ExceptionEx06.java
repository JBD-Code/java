
public class ExceptionEx06 {
	public static void main(String[]args){
		//checked ���� unchecked���� 
		//checked ���� : �����Ϸ��� ���� ó�� ���θ� üũ(���� ó�� �ʼ�) Exception class �ڼ�  
		//unchecked ���� : �����Ϸ��� ���� ó�� ���θ� üũ ���� ���� ( ���� ó�� ����) RuntimeException class �ڼ�
		
		try {
			//Exception�� �� �ڼ��� �ݵ�� ���� ó���� �ؾ� �Ѵ�(�ʼ�)
			throw new Exception(); //Exception�� ���Ƿ� �߻� 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			//RumtimeException�� �� �ڼ��� ����ó���� ������ �ʾƵ� �������� �����ϴ�(����)
		throw new RuntimeException();
	}
}
