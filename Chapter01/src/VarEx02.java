
public class VarEx02 {
	public static void main(String[]args){
		
		//variable 하나의 값을 저장하기 위한 공간
		//constant 한번만 값을 저장 가능한 변수 
		//literal  그 자체로 값을 의미하는 것 
		
		//int score = 100; 
		//System.out.println(score);
		
		//score = 200; 
		//System.out.println(score);
		
		final int score ;
		score=200; 
		System.out.println(score);
		
		
		//literal의 접두사 접미사 
		//접두사와 접미사는 대소문자를 구별하지 않는다 
		boolean power = true; 
		System.out.println(power);
		byte b = 127; // -128 ~ 127 
		
		int oct = 010; // 8진수 , 10진수로 8
		int hex = 0x10; // 16진수, 10진수로 16
		System.out.println(oct);
		System.out.println(hex);
		
		//long l = 1000_000_000;
		long l = 10_000_000_000L;
		
		float f = 3.14f; 
		double d = 3.14f;
		
		char ch = 'A'; 
		String str = "ABC"; 
		
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3);
		
		// 변수와 리터럴 타입의 불일치 
		// 1 범위가 variable > literal 인 경우에는 가능 하다 
		//int i ='A';   // int >char 
		//long l = 123; // long > int
		//double d = 3.14f; //double > float 
		
		// 2 범위가 variable > literal 인 경우에는 불가능하다 
		// 3 byte, short 변수에 int literal 저장은 가능하다 
	
		
		//문자와 문자열 
		char ch01 = 'A'; 
		//char ch01 = 'AB'; //Error 발생 
		//char ch02 = '';   //Error 발생 
		String s = "ABC"; 
		
		String s1 = "AB"; 
		String s2 = new String("AB");
		
		String s3 = "A"; 
		String s4 = ""; //빈 문자열 
		
		String s5 = "A" + "B"; 
		System.out.println(s5);
		System.out.println("" + 7 +7);
		System.out.println(7 + 7 +"");
		
		int i = 'A';
		System.out.println(i);
	}
}
