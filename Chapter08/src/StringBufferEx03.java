
public class StringBufferEx03 {
	public static void main(String[]args){
		//StringBuffer�� �����ڿ� �޼��� 
		
		//StringBuffer insert(int pos, boolean b)
		//StringBuffer insert(int pos, char c)
		//StringBuffer insert(int pos, char[] str)
		//StringBuffer insert(int pos, double d)
		//StringBuffer insert(int pos, float f)
		//StringBuffer insert(int pos, int i )
		//StringBuffer insert(int pos, long l)
		//StringBuffer insert(int pos, Object obj)
		//StringBuffer insert(int pos, String str)
		//�ι�° �Ű������� ���� ���� ���ڿ��� ��ȯ�Ͽ� ������ ��ġ(pos)�� �߰��Ѵ� pos�� 0���� ���� 
		
		StringBuffer sb = new StringBuffer("0123456");
		sb.insert(4,'.');
		System.out.println(sb);
		sb.insert(5, true);
		System.out.println(sb);
		
		//int length() 
		//StringBuffer �ν��Ͻ��� ���ڿ��� ���̸� ��ȯ�Ѵ� 
		int length = sb.length();
		System.out.println(length);
		
		//StringBuffer replace(int start, int end, String str) 
		//������ ����(start, end)�� ���ڵ��� �־��� ���ڿ��� �ٲ۴�. end��ġ�� ���ڴ� ������ ���Ե��� �ʴ´� 
		StringBuffer sb1 = new StringBuffer("abcdefg");
		System.out.println(sb1);
		sb1.replace(2, 5, "345");
		System.out.println(sb1);
		
		//StringBuffer reverse() 
		//StringeBuffer �ν��Ͻ��� ����Ǿ� �ִ� ���ڿ��� ������ �Ųٷ� �����Ѵ� 
		sb1.reverse();
		System.out.println(sb1);
		
		//void setCharAt(int index, char ch)
		//������ ��ġ�� ���ڸ� �־��� ����(ch)�� �ٲ۴� 
		sb1.setCharAt(2, '8');
		System.out.println(sb1);
		
		//void setLength(int newLength)
		//������ ���̷� ���ڿ��� ���̸� �����Ѵ� 
		//���̸� �ø��� ��쿡  ������ �� ������ null���� '\u0000'�� ä��� 
		
		StringBuffer sb2 = new StringBuffer("12345");
		StringBuffer sb3 = new StringBuffer("12345");
		sb2.setLength(10);
		sb3.setLength(4);
		System.out.println(sb2+".");
		System.out.println(sb3);
		String str = sb2.toString().trim();
		System.out.println(str+".");
		
		//String toString() 
		//StringBuffer �ν��Ͻ��� ���ڿ���  String �� ��ȯ 
		StringBuffer sb4 = new StringBuffer("012345");
		String str1 = sb4.toString();
		System.out.println(str1);
		
		//String subString(int start)
		//String subString(int start, int end)
		//������ ���� ���� ���ڿ��� String���� �̾Ƽ� ��ȯ�Ѵ� 
		//������ġ�� ���� �ϸ� ������ġ���� ���ڿ� ������ �̾Ƽ� ��ȯ�Ѵ� 
		String str2=sb4.substring(3);
		System.out.println(str2);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
