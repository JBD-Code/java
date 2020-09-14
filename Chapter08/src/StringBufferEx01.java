
public class StringBufferEx01 {
	public static void main(String[]args){
		//StringBuffer class
		//문자열을 저장하고 다루기 위한 클래스 
		//String 처럼 문자형 배열(char[])을 내부적으로 가지고 있다 
		//String과는 달리 내용을 변경할 수 있다
		StringBuffer sb = new StringBuffer("abc");
		sb.append("123");
		System.out.println(sb);
		
		//StringBuffer 생성자 
		//배열은 길이를 변경이 불가능, 공간이 부족하면 새로운 배열을 생성해야 한다 
		//StringBuffer는 문자열의 길이를 고려해서 적절한 크기로 생성해야 한다 
		//append()는 지정된 내용을 StringBuffer에 추가 후, StringBuffer의 참조를 변환
		StringBuffer sb2 = new StringBuffer("def");
		sb2.append("456").append("ghi");
		System.out.println(sb2);
	
		//StringBuffer는 equals()가 오버라이딩 되어있지 않다(주소 비교) 
		//StringBuffer을 String 로 변환한 후 에 equals()로 비교해야 한다 
		
		StringBuffer sb3 = new StringBuffer("abc");
		StringBuffer sb4 = new StringBuffer("abc");
		System.out.println(sb3==sb4); //false
		System.out.println(sb3.equals(sb4)); //false 
		String str3 = sb3.toString();
		String str4 = sb4.toString();
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
	}
}
