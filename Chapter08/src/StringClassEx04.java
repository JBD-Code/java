
public class StringClassEx04 {
	public static void main(String[]args){
		//String Ŭ������ �����ڿ� �޼���
		
		//String[]split(String regex) 
		//���ڿ��� ������ �и���(regex)�� ������ ���ڿ� �迭�� ��� ��ȯ�Ѵ� 
		String animals = "dog,cat,bear";
		String[] arr = animals.split(",");
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		
		//String []split(String regex, int  limit)
		//���ڿ� �� ������ �и��ڷ� ������ ���ڿ� �迭�� ��� ��ȯ�Ѵ� 
		//�� ���ڿ��� ������ ��(limit)�� �ڸ��� 
		String []arr1 = animals.split(",", 2);
		
		for(int i=0; i<arr1.length; i++){
			System.out.println(arr1[i]);
		}
		
		//boolean startWith(String prefix)
		//�־��� ���ڿ��� �����ϴ��� �˻��Ѵ� 
		String s = "java.lang.Object";
		boolean b1 = s.startsWith("java");
		boolean b2 = s.startsWith("lang");
		System.out.println(b1);
		System.out.println(b2);
		
		//String substring(int begin)
		//String substring(int begin, int end)
		//�־��� ������ġ(begin)���� ����ġ (end)������ ���Ե� ���ڿ��� ��´� 
		//�̶� ������ġ ���ڴ� ������ ���Ե����� ����ġ�� ���Ե��� �ʴ´� 
		
		String s1 =s.substring(10);
		System.out.println(s1);
		String s2 = s.substring(5,9);
		System.out.println(s2);
		
		
		//String toLowerCase()
		//String �ν��Ͻ��� ����Ǿ� �ִ� ��� ���ڿ��� �ҹ��ڷ� ��ȯ�Ͽ� ��ȯ 
		String str = "HELLO";
		System.out.println(str.toLowerCase());
		
		//String toUpperCase()
		//String �ν��Ͻ��� ����Ǿ� �ִ� ��� ���ڿ��� �빮�ڷ� ��ȯ�Ͽ� ��ȯ 
		String str1 = "hello";
		System.out.println(str1.toUpperCase());
		
		//String trim()
		//���ڿ��� ����, ������ ���� �ִ� ������ ���� ����� ��ȯ�Ѵ� 
		//�̶� ���ڿ� �߰��� �ִ� ������ ���� ���� �ʴ´� 
		String str2 ="   Hello World   ";
		System.out.println(str2.trim());
		System.out.println(str2);
		
		//valueOf()
		//������ ���� ���ڿ��� ġȯ�Ͽ� ��ȯ�Ѵ� 
		//���������� ��� toString()�� ȣ���� ����� ��ȯ�Ѵ� 
		System.out.println(String.valueOf(true));
		System.out.println(String.valueOf('a'));
		System.out.println(String.valueOf(100));
		System.out.println(String.valueOf(100L));
		System.out.println(String.valueOf(10f));
		java.util.Date dd = new java.util.Date();
		System.out.println(dd);
	}
}
