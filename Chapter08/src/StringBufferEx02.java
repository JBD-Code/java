
public class StringBufferEx02 {
	public static void main(String []args){
		//StringBuffer�� �����ڿ� �޼���
		//StringBuffer sb = new StringBuffer(); 
		//16���ڸ� ���� �� �ִ� ���۸� ���� StringBuffer �ν��Ͻ��� �����Ѵ� 
		StringBuffer sb = new StringBuffer("");
		
		//StringBuffer(int length)
		//������ ������ ���ڸ� ���� �� �ִ� ���۸� ���� StringBuffer�ν��Ͻ��� �����Ѵ� 
		StringBuffer sb1 = new StringBuffer(10);
		
		//StringBuffer(String str)
		//������ ���ڿ� ��(str)�� ���� StringBuffe �ν��Ͻ��� �����Ѵ� 
		
		StringBuffer sb2 = new StringBuffer("Hello");
		
		//StringBuffer append(boolean b)
		//StringBuffer append(char c)
		//StringBuffer append(char[] c)
		//StringBuffer append(double d)
		//StringBuffer append(float f)
		//StringBuffer append(int i)
		//StringBuffer append(long l)
		//StringBuffer append(Object obj)
		//StringBuffer append(String str)
		//�Ű������� �Էµ� ���� ���ڿ��� ��ȯ�Ͽ� StringBuffer �ν��Ͻ��� �����ϰ� �ִ� ���ڿ��� ��ü �����δ� 
		
		sb1.append(10.0f);
		System.out.println(sb1);
		sb2.append(true);
		System.out.println(sb2);
		sb2.append(123).append('C');
		System.out.println(sb2);
		
		//int capacity
		//StringBuffer�ν��Ͻ��� ����ũ�⸦ �˷��ش� 
		//length()�� ���ۿ� ��� ���ڿ��� ���̸� �˷��ش� 
		StringBuffer sb3 = new StringBuffer(100);
		sb3.append("abcd");
		int bufferSize = sb3.capacity();
		int stringSize = sb3.length();
		System.out.println(bufferSize);
		System.out.println(stringSize);
		
		//char cahrAt(int index)
		//������ ��ġ(index)�� �ִ� ���ڸ� ��ȯ�Ѵ� 
		char c = sb3.charAt(3);
		System.out.println(c);
		
		//StringBuffer delete(int start, int end) 
		//������ġ(start)���� �� ��ġ(end)���̿� �ִ� ���ڸ� �����Ѵ� �� �� ��ġ ���ڴ� �����Ѵ� 
		sb3.append("efgh");
		System.out.println(sb3);
		sb3.delete(3, 6);
		System.out.println(sb3);
		
		//StringBuffer deleteCharAt(int index)
		//������ ��ġ(index)�� ���ڸ� �����Ѵ� 
		sb3.deleteCharAt(4);
		System.out.println(sb3);
		
		
		
	}
}
