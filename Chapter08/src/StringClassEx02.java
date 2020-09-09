
public class StringClassEx02 {
	public static void main(String[]args){
		//String 클래스의 생성자와 메서드 
		
		//String(String s) 
		//주어진 문자열 (s)를 갖는 String 인스턴스를 생성한다 
		String s = new String("Hello");
		System.out.println(s);
		
		//String(char[]value) 
		//주언진 문자열(value)을 갖는 인스턴스를 생성한다 
		char[] c= {'H', 'E', 'L', 'L', 'O'};
		String s1 = new String(c); 
		System.out.println(s1);
		String s2 = "HELLO"; 
		System.out.println(s2.toCharArray());
		
		//String(StringBuffer buf) 
		//StringBuffer 인스턴스가 가지고 있는 문자열과 같은 내용의 String 인스턴스를 생성한다 
		//StringBuffer는 내용 변경 가능한 문자열
		StringBuffer sb = new StringBuffer("World");
		String s3= new String (sb);
		
		//char charAt(int index)
		//지정된 위치에 있는 문자를 알려준다(index는 0부터 시작)
		char c1 = s.charAt(0);
		char c2 = s3.charAt(1);
		System.out.println(c1);
		System.out.println(c2);
		
		//int compartTo(String str) 
		//문자열(str)과 사전순서를 비교한다 같으면 0 을 반환
		//사전순으로 이전이면 음수를 반환
		//사전순으로 이후면 양수를 반환 
		
		int i1 = "aaa".compareTo("aaa");
		int i2 = "aaa".compareTo("bbb");
		int i3 = "bbb".compareTo("aaa");
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);

		
		
		
	}
}
