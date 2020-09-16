
public class StringBufferEx02 {
	public static void main(String []args){
		//StringBuffer의 생성자와 메서드
		//StringBuffer sb = new StringBuffer(); 
		//16문자를 담을 수 있는 버퍼를 가진 StringBuffer 인스턴스를 생성한다 
		StringBuffer sb = new StringBuffer("");
		
		//StringBuffer(int length)
		//지정된 개수의 문자를 감을 수 있는 버퍼를 가진 StringBuffer인스턴스를 생성한다 
		StringBuffer sb1 = new StringBuffer(10);
		
		//StringBuffer(String str)
		//지정된 문자열 값(str)을 갖는 StringBuffe 인스턴스를 생성한다 
		
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
		//매개변수로 입력된 값을 문자열로 변환하여 StringBuffer 인스턴스가 저장하고 있는 문자열의 뒤체 덧붙인다 
		
		sb1.append(10.0f);
		System.out.println(sb1);
		sb2.append(true);
		System.out.println(sb2);
		sb2.append(123).append('C');
		System.out.println(sb2);
		
		//int capacity
		//StringBuffer인스턴스의 버퍼크기를 알려준다 
		//length()는 버퍼에 담기 문자열의 길이를 알려준다 
		StringBuffer sb3 = new StringBuffer(100);
		sb3.append("abcd");
		int bufferSize = sb3.capacity();
		int stringSize = sb3.length();
		System.out.println(bufferSize);
		System.out.println(stringSize);
		
		//char cahrAt(int index)
		//지정된 위치(index)에 있는 문자를 반환한다 
		char c = sb3.charAt(3);
		System.out.println(c);
		
		//StringBuffer delete(int start, int end) 
		//시작위치(start)부터 끝 위치(end)사이에 있는 문자를 제거한다 단 끝 위치 문자는 제외한다 
		sb3.append("efgh");
		System.out.println(sb3);
		sb3.delete(3, 6);
		System.out.println(sb3);
		
		//StringBuffer deleteCharAt(int index)
		//지정된 위치(index)의 문자를 제거한다 
		sb3.deleteCharAt(4);
		System.out.println(sb3);
		
		
		
	}
}
