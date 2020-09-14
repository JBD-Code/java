
public class StringEx01 {
	public static void main(String[]args){
		//join()과 StringJoiner 
		//join()은 여러 문자열 사이에 구분자를 넣어서 결합한다 
		String animals = "dog,cat,bear";
		String []arr = animals.split(",");
		String str = String.join("-", arr);
		System.out.println(str);
		
		//숫자를 문자열로 바꾸는 방법 
		int i =100; 
		String str1 = i+""; 
		String str2 = String.valueOf(i);

		//문자열을 숫자로 바꾸는 방법 
		//기본형 
		//byte b   = Byte.parseByte(String s)
		//short s  = Short.parseInt(String s)
		//long l   = Long.parseLong(String s)
		//float f  = Float.parseFloat(String s)
		//double d = Double.parseDouble(String s) 
		//int i = Integer.parseInt(String s) 
		
		//참조형
		//byte b = Byte.vaueOf(String s)
		//short s  = Short.vaueOf(String s)
		//long l   = Long.vaueOf(String s)
		//float f  = Float.vaueOf(String s)
		//double d = Double.vaueOf(String s) 
		
		int i1 = Integer.parseInt("100");
		byte b = Byte.valueOf("100");
		System.out.println(b);
	}
}
