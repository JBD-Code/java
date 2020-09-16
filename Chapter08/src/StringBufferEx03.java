
public class StringBufferEx03 {
	public static void main(String[]args){
		//StringBuffer의 생성자와 메서드 
		
		//StringBuffer insert(int pos, boolean b)
		//StringBuffer insert(int pos, char c)
		//StringBuffer insert(int pos, char[] str)
		//StringBuffer insert(int pos, double d)
		//StringBuffer insert(int pos, float f)
		//StringBuffer insert(int pos, int i )
		//StringBuffer insert(int pos, long l)
		//StringBuffer insert(int pos, Object obj)
		//StringBuffer insert(int pos, String str)
		//두번째 매개변수로 받은 값을 문자열로 반환하여 지정된 위치(pos)에 추가한다 pos는 0부터 시작 
		
		StringBuffer sb = new StringBuffer("0123456");
		sb.insert(4,'.');
		System.out.println(sb);
		sb.insert(5, true);
		System.out.println(sb);
		
		//int length() 
		//StringBuffer 인스턴스의 문자열의 길이를 반환한다 
		int length = sb.length();
		System.out.println(length);
		
		//StringBuffer replace(int start, int end, String str) 
		//지정된 범위(start, end)의 문자들을 주어진 문자열로 바꾼다. end위치의 문자는 범위에 포함되지 않는다 
		StringBuffer sb1 = new StringBuffer("abcdefg");
		System.out.println(sb1);
		sb1.replace(2, 5, "345");
		System.out.println(sb1);
		
		//StringBuffer reverse() 
		//StringeBuffer 인스턴스에 저장되어 있는 문자열의 순서를 거꾸로 나열한다 
		sb1.reverse();
		System.out.println(sb1);
		
		//void setCharAt(int index, char ch)
		//지정된 위치의 문자를 주어진 문자(ch)로 바꾼다 
		sb1.setCharAt(2, '8');
		System.out.println(sb1);
		
		//void setLength(int newLength)
		//지정된 길이로 문자열의 길이를 변경한다 
		//길이를 늘리는 경우에  나머지 빈 공간을 null문자 '\u0000'로 채운다 
		
		StringBuffer sb2 = new StringBuffer("12345");
		StringBuffer sb3 = new StringBuffer("12345");
		sb2.setLength(10);
		sb3.setLength(4);
		System.out.println(sb2+".");
		System.out.println(sb3);
		String str = sb2.toString().trim();
		System.out.println(str+".");
		
		//String toString() 
		//StringBuffer 인스턴스의 문자열을  String 로 변환 
		StringBuffer sb4 = new StringBuffer("012345");
		String str1 = sb4.toString();
		System.out.println(str1);
		
		//String subString(int start)
		//String subString(int start, int end)
		//지정된 범위 내의 문자열을 String으로 뽑아서 변환한다 
		//시작위치만 지정 하면 시작위치부터 문자열 끝까지 뽑아서 반환한다 
		String str2=sb4.substring(3);
		System.out.println(str2);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
