
public class StringBufferEx01 {
	public static void main(String[]args){
		//StringBuffer class
		//���ڿ��� �����ϰ� �ٷ�� ���� Ŭ���� 
		//String ó�� ������ �迭(char[])�� ���������� ������ �ִ� 
		//String���� �޸� ������ ������ �� �ִ�
		StringBuffer sb = new StringBuffer("abc");
		sb.append("123");
		System.out.println(sb);
		
		//StringBuffer ������ 
		//�迭�� ���̸� ������ �Ұ���, ������ �����ϸ� ���ο� �迭�� �����ؾ� �Ѵ� 
		//StringBuffer�� ���ڿ��� ���̸� ����ؼ� ������ ũ��� �����ؾ� �Ѵ� 
		//append()�� ������ ������ StringBuffer�� �߰� ��, StringBuffer�� ������ ��ȯ
		StringBuffer sb2 = new StringBuffer("def");
		sb2.append("456").append("ghi");
		System.out.println(sb2);
	
		//StringBuffer�� equals()�� �������̵� �Ǿ����� �ʴ�(�ּ� ��) 
		//StringBuffer�� String �� ��ȯ�� �� �� equals()�� ���ؾ� �Ѵ� 
		
		StringBuffer sb3 = new StringBuffer("abc");
		StringBuffer sb4 = new StringBuffer("abc");
		System.out.println(sb3==sb4); //false
		System.out.println(sb3.equals(sb4)); //false 
		String str3 = sb3.toString();
		String str4 = sb4.toString();
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
	}
}
