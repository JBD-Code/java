
public class StringBufferEx05 {
	public static void main(String[]args){
		//StringBuilder 
		//StringBuffer�� ����ȭ �Ǿ� �ִ�. ��Ƽ�����忡 ����(thread-safe)
		//��Ƽ�����尡 �ƴ� ��� ����ȭ�� ���ʿ��� ������ ���Ͻ�Ų�� 
		//�̱۾����忡�� StringBuffer��� StringBuilder�� ����ϸ� ������ ��� ��Ų�� 
		
		//Single Thread
		StringBuilder sb; 
		sb = new StringBuilder();
		sb.append("abc");
		System.out.println(sb);
		
		//Multi Thread 
		//StringBuilder sb; 
		//sb = new StringBuilder();
		//sb.append("abc");
		//System.out.println(sb);
		
	}
}
