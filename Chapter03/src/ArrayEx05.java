
public class ArrayEx05 {
	public static void main(String[]args){
		//String class 
		//String class�� char[]�� Method�� ������ �� 
		//String class�� ������ ������ �� ���� (read only)  
		String a = "a";
		String b = "b";
		a = a+b; 
		System.out.println(a);
		
		//String class �� �ֿ� Method 
		
		//char charAt(int index) ���ڿ����� �ش� ��ġ�� �ִ� ���ڸ� ��ȯ�Ѵ� 
		String str = "ABCDE";
		char ch =str.charAt(4);
		System.out.println(ch);
		
		//int length() ���ڿ��� ���̸� ��ȯ�Ѵ� 
		System.out.println(str.length());
		
		//String subString (int from, int to) 
		//���ڿ��� �ش� ����(from~to)�� ���ڿ��� ��ȯ�Ѵ� to �� ���Ե��� �ʴ´� 
		String tmp = str.substring(1,4);
		String tmp1 = str.substring(1,str.length());
		System.out.println(tmp);
		System.out.println(tmp1);
		
		//boolean equals(Object obj) ���ڿ��� ������ ������ Ȯ���Ѵ� 
		String str1 = "ABCDE";
		System.out.println(str.equals(str1));
		
		//char[] toCharArray() 
		//���ڿ��� ���ڹ迭(char[])�� ��ȯ�ؼ� ��ȯ�Ѵ� 
		System.out.println(str.toCharArray());
	}
	
}
