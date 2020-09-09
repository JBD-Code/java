
public class StringClassEx01 {
	public static void main(String[]args){
		//String class
		//문자열을 다루는데 사용되는 클래스 
		//String class= data(char[]) + method(문자열 관련) 
		//String class 는 내용을 변경할 수 없는 불변(immutable) 클래스이다 
		
		String str1 = "abc"; //문자열 리터럴 "abc"의 주소가 str1에 저장 
		String str2 = "abc"; //문자열 리터럴 "abc"의 주소가 str에 저장
		String str3 = new String("abc"); //새로운 String 인스턴스를 생성 
		String str4 = new String("abc"); //새로운 String 인스턴스를 생성 
		
		
		
		if(str1==str2){
			System.out.println("str1 과 str2는 같다");
		} else {
			System.out.println("str1과 str2는 다르다");
		}
		
		if(str3==str4){
			System.out.println("str3 과 str4는 같다");
			
		} else {
			System.out.println("str3과 str4는 다르다");
		}	
		
		if(str1.equals(str2)){
			System.out.println("str1 과 str2는 같다");
		}else {
			System.out.println("str1과 str2는 다르다");
		}

		if(str3.equals(str4)){
			System.out.println("str3 과 str4는 같다");
			
		} else {
			System.out.println("str3과 str4는 다르다");
		}
		
		//문자열 리터럴
		//문자열 리터럴은 프로그램 실행시 자동으로 생성된다 (constant pool에 저장)
		//같은 내용의 문자열 리터럴은 하나만 만들어진다 
		String s1 = "AAA";
		String s2 = "AAA";
		String s3 = "AAA";
		String s4 = "AAA";
		
		//빈 문자열("" ,empty String) 
		//내용이 없는 문자열 크기가 0인 cahr 배열을 저장하는 문자열 
		String str = ""; 
		
		//크기가 0인  배열을 생하는 것은 어느 타입이나 가능 
		char[]chArr = new char[0];//길이가 0인 char배열 
		int[] iArr = {}; //길이가 0인 int 배열 
		
		
		
		
		
		
		
		
		
	}
}
