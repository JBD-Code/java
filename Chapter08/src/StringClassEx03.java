
public class StringClassEx03 {
	public static void main(String[]args){
		//String Ŭ������ �����ڿ� �޼��� 
		//String concat(String str) 
		//���ڿ�(str)�� �ڿ� �����δ� 
		String s = "Hello";
		String s2 = s.concat(" world");
		System.out.println(s2);
		
		//boolean contains(CharSequence s) 
		//������ ���ڿ�(s)�� ���ԵǾ��ִ����� �˻��Ѵ� 
		boolean b = s2.contains("wo");
		System.out.println(b);
		
		//booelan endWith(String suffix)
		//������ ���ڿ�(suffix)�� ���������� �˻��Ѵ� 
		String file = "Hello.txt";
		boolean endType = file.endsWith("txt");
		
		//boolean equals(Object obj) 
		//�Ű������� ���� ���ڿ� (obj)�� String �ν��Ͻ��� ���ڿ��� ���Ѵ� 
		//obj�� String�� �ƴϰų� ���ڿ��� �ٸ��� false�� ��ȯ�Ѵ� 
		
		String s3 = "Hello";
		System.out.println(s3.equals(s2));
		System.out.println(s3.equals(s));
		
		//boolean equalsIgnoreCase(String str) 
		//���ڿ��� String �ν��Ͻ��� ���ڿ��� ��ҹ��� ���� ���� �� �Ѵ� 
		boolean b1 = s3.equalsIgnoreCase("hello");
		boolean b2 = s3.equalsIgnoreCase("HELLO");
		System.out.println(b1);
		System.out.println(b2);
		
		//int indexx(int ch) 
		//�־��� ����(ch)�� ���ڿ��� �����ϴ����� Ȯ���Ͽ� index�� �˷��ش� . 
		//�� ã���� -1�� ��ȯ�Ѵ� 
		int idx = s3.indexOf("l");
		int idx2 = s3.indexOf("w");
		System.out.println(idx);
		System.out.println(idx2);
		
		//int indexOf(int ch, int pos)
		//�־��� ����(ch)�� ���ڿ��� �����ϴ��� ������ ��ġ(pos)���� Ȯ���Ͽ� ��ġ�� �˷��ش�
		//�� ã���� 1�� ��ȯ�Ѵ� 
		int idx3 = s3.indexOf("2", 0);
		System.out.println(idx3);
		
		//int indexOf(String str)
		//�־��� ���ڿ��� �����ϴ����� Ȯ���Ͽ� �� ��ġ�� (index)�� �˷��ش�. 
		//������ -1�� ��ȯ�Ѵ� 
		String str1= "ABCDEFG";
		int idx4 = str1.indexOf("CDE");
		System.out.println(idx4);
		
		//inrt lastIndexog(int ch)
		//������ ���� �Ǵ� ���� �ڵ带 ���ڿ��� ������ ������ ã�Ƽ� ��ġ�� �˷��ش� 
		//��ã���� -1�� ��ȯ�Ѵ� 
		String str2  = "java.lang.java";
		int idx5 = str2.lastIndexOf(".");
		int idx6 = str2.indexOf(".");
		System.out.println(idx5);
		System.out.println(idx6);
		
		//int lastIndexOf(String str)
		//������ ���ڿ��� �ν��Ͻ��� ���ڿ� ������ ���� ã�Ƽ� index�� �˷��ش� 
		//�� ã���� -1�� ��ȯ�Ѵ� 
		int idx7 = str2.lastIndexOf("java");
		int idx8 = str2.indexOf("java");
		System.out.println(idx7);
		System.out.println(idx8);
		
		//int length() 
		//���ڿ��� ���̸� �˷��ش� 
		System.out.println(str2.length());
	}
}
