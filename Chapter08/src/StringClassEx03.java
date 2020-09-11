
public class StringClassEx03 {
	public static void main(String[]args){
		//String 클래스의 생성자와 메서드 
		//String concat(String str) 
		//문자열(str)을 뒤에 덧붙인다 
		String s = "Hello";
		String s2 = s.concat(" world");
		System.out.println(s2);
		
		//boolean contains(CharSequence s) 
		//지정된 문자열(s)가 포함되어있는지를 검사한다 
		boolean b = s2.contains("wo");
		System.out.println(b);
		
		//booelan endWith(String suffix)
		//지정된 문자열(suffix)로 끝나는지를 검사한다 
		String file = "Hello.txt";
		boolean endType = file.endsWith("txt");
		
		//boolean equals(Object obj) 
		//매개변수로 받은 문자열 (obj)와 String 인스턴스의 문자열을 비교한다 
		//obj가 String이 아니거나 문자열이 다르면 false를 반환한다 
		
		String s3 = "Hello";
		System.out.println(s3.equals(s2));
		System.out.println(s3.equals(s));
		
		//boolean equalsIgnoreCase(String str) 
		//문자열과 String 인스턴스의 문자열을 대소문자 구분 없이 비교 한다 
		boolean b1 = s3.equalsIgnoreCase("hello");
		boolean b2 = s3.equalsIgnoreCase("HELLO");
		System.out.println(b1);
		System.out.println(b2);
		
		//int indexx(int ch) 
		//주어진 문자(ch)가 문자열에 존재하는지를 확인하여 index를 알려준다 . 
		//못 찾으면 -1을 반환한다 
		int idx = s3.indexOf("l");
		int idx2 = s3.indexOf("w");
		System.out.println(idx);
		System.out.println(idx2);
		
		//int indexOf(int ch, int pos)
		//주어진 문자(ch)가 문자열에 존재하는지 지정된 위치(pos)부터 확인하여 위치를 알려준다
		//못 찾으면 1을 반환한다 
		int idx3 = s3.indexOf("2", 0);
		System.out.println(idx3);
		
		//int indexOf(String str)
		//주어진 문자열이 존재하는지를 확인하여 그 위치를 (index)를 알려준다. 
		//없으면 -1을 반환한다 
		String str1= "ABCDEFG";
		int idx4 = str1.indexOf("CDE");
		System.out.println(idx4);
		
		//inrt lastIndexog(int ch)
		//지정된 문자 또는 문자 코드를 문자열의 오른족 끝에서 찾아서 위치를 알려준다 
		//못찾으면 -1을 반환한다 
		String str2  = "java.lang.java";
		int idx5 = str2.lastIndexOf(".");
		int idx6 = str2.indexOf(".");
		System.out.println(idx5);
		System.out.println(idx6);
		
		//int lastIndexOf(String str)
		//지정된 문자열을 인스턴스의 문자열 끝에서 부터 찾아서 index를 알려준다 
		//못 찾으면 -1을 반환한다 
		int idx7 = str2.lastIndexOf("java");
		int idx8 = str2.indexOf("java");
		System.out.println(idx7);
		System.out.println(idx8);
		
		//int length() 
		//문자열의 길이를 알려준다 
		System.out.println(str2.length());
	}
}
