
public class ExceptionEx02 {
	public static void main(String []args){
		//try-catch
		
		//���� ���α׷� ���� �� �߻��� �� �ִ� ������ �߻��� ����� �ڵ带 �ۼ��ϴ� �� 
		//���� ���α׷� ������ ���Ḧ ����, �������� ���� ���¸� �����ϴ� �� 
		
		//try {
			//���ܰ� �߻��� ���ɼ��� �ִ� ������� �ֈf�� 
		//} catch(Exception e1) {
			//Exception e1�� �߻� ���� ���, �̸� ó���ϱ� ���� ������ ���´� 
		//} catch(Exception e2) {
			//Exception e2�� �߻� ���� ���, �̸� ó���ϱ� ���� ������ ���´� 
		//} catch(Exception e3) {
			//Exception e3�� �߻� ���� ���, �̸� ó���ϱ� ���� ������ ���´� 
	
		//}
		System.out.println(1);
		try{
			System.out.println(2);
			System.out.println(3);

		}catch (Exception e) {
			System.out.println(4);
		}
		System.out.println(5);
		System.out.println("/////////////");
		//try �� ������ ���ܰ� �߻��� ��� 
			//1. �߻��� ���ܿ� ��ġ�ϴ� catch ���� �ִ��� Ȯ���Ѵ� 
			//2. ��ġ�ϴ� catch���� ã�� �Ǹ� �� catch ������ ������ �����ϰ� ��ü try-catch����
			//	 ���������� �� ���� ������ ��� �����Ѵ�. ���� ��ġ�ϴ� catch���� ã�� ���ϸ� ���ܴ� ó���� �� ���� 
		
		//try �� ������ ���ܰ� �߻����� ���� ��� 
			//1. catch ���� ��ġ�� �ʰ� ��ü try-catch ���� ���������� ������ ��� �Ѵ�  
		System.out.println(1);
		try{
			System.out.println(0/0);
			System.out.println(2);
			System.out.println(3);
		}catch (Exception e) {
			System.out.println(4);
		}
		System.out.println(5);
		
		
		
	}
}
