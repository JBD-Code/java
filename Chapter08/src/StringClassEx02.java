
public class StringClassEx02 {
	public static void main(String[]args){
		//String Ŭ������ �����ڿ� �޼��� 
		
		//String(String s) 
		//�־��� ���ڿ� (s)�� ���� String �ν��Ͻ��� �����Ѵ� 
		String s = new String("Hello");
		System.out.println(s);
		
		//String(char[]value) 
		//�־��� ���ڿ�(value)�� ���� �ν��Ͻ��� �����Ѵ� 
		char[] c= {'H', 'E', 'L', 'L', 'O'};
		String s1 = new String(c); 
		System.out.println(s1);
		String s2 = "HELLO"; 
		System.out.println(s2.toCharArray());
		
		//String(StringBuffer buf) 
		//StringBuffer �ν��Ͻ��� ������ �ִ� ���ڿ��� ���� ������ String �ν��Ͻ��� �����Ѵ� 
		//StringBuffer�� ���� ���� ������ ���ڿ�
		StringBuffer sb = new StringBuffer("World");
		String s3= new String (sb);
		
		//char charAt(int index)
		//������ ��ġ�� �ִ� ���ڸ� �˷��ش�(index�� 0���� ����)
		char c1 = s.charAt(0);
		char c2 = s3.charAt(1);
		System.out.println(c1);
		System.out.println(c2);
		
		//int compartTo(String str) 
		//���ڿ�(str)�� ���������� ���Ѵ� ������ 0 �� ��ȯ
		//���������� �����̸� ������ ��ȯ
		//���������� ���ĸ� ����� ��ȯ 
		
		int i1 = "aaa".compareTo("aaa");
		int i2 = "aaa".compareTo("bbb");
		int i3 = "bbb".compareTo("aaa");
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);

		
		
		
	}
}
