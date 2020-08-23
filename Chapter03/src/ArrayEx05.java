
public class ArrayEx05 {
	public static void main(String[]args){
		//String class 
		//String class는 char[]와 Method를 결합한 것 
		//String class는 내욜을 변경할 수 없다 (read only)  
		String a = "a";
		String b = "b";
		a = a+b; 
		System.out.println(a);
		
		//String class 의 주요 Method 
		
		//char charAt(int index) 문자열에서 해당 위치에 있는 문자를 반환한다 
		String str = "ABCDE";
		char ch =str.charAt(4);
		System.out.println(ch);
		
		//int length() 문자열의 길이를 반환한다 
		System.out.println(str.length());
		
		//String subString (int from, int to) 
		//문자열의 해당 범위(from~to)의 문자열을 반환한다 to 는 포함되지 않는다 
		String tmp = str.substring(1,4);
		String tmp1 = str.substring(1,str.length());
		System.out.println(tmp);
		System.out.println(tmp1);
		
		//boolean equals(Object obj) 문자열의 내용이 같은지 확인한다 
		String str1 = "ABCDE";
		System.out.println(str.equals(str1));
		
		//char[] toCharArray() 
		//문자열을 문자배열(char[])로 변환해서 반환한다 
		System.out.println(str.toCharArray());
	}
	
}
