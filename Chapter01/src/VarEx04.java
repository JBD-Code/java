
public class VarEx04 {
	public static void main(String[]args){

	//1 형식화된 출력 		
		//1 println()의 단점 - 출력 형식 지정 불가 
		//실수의 자리수 조절 불가 
		System.out.println(10/3); //3 
		System.out.println(10.0/3); //3.3333333333333335
		//2 10진수로만 출력한다 - 8진수 16진수로 출력할 경우 
		System.out.println(0x1A);
		
		//2 printf()로 출력 형식 지정 가능 
		System.out.printf("%.2f", 10.0/3);//3.33
		System.out.printf("%d%n", 0x1A); //26
		System.out.printf("%x%n", 0x1A); //1a
		/*
		printf()의 지시자 
		%b 			boolean 형식으로 출력 
		%d 			decimal 정수의 형식으로 출력 
		%o 			octal 정수의 형식으로 출력 
		%x, %X 		hexa-decimal 정수의 형식으로 출력 
		%f			부동소수점 (floationg-point  	 			
		%c 			문자(character)로 출력 
		%s			문자열 (String)로 출력
		*/
		
		System.out.printf("\nage:%d year:%d\n", 14 ,2017);
		System.out.printf("%d%n", 15);//10진수
		System.out.printf("%o%n", 15);//8진수
		System.out.printf("%x%n", 15);//16진수 
		System.out.printf("%s%n", Integer.toBinaryString(15)); //1111 2진수
	
		//8진수와 16진수에 접두사 붙이기 
		System.out.printf("%#o%n", 15); //017
		System.out.printf("%#x%n", 15); //0xf
		System.out.printf("%#X%n", 15); //0XF
		
		//실수 출력을 위한 지시자 %ㅇ - 지수형식 (%e), 간략한 혁식(%g)
		float f = 124.4567890f; 
		System.out.printf("%f%n", f);
		System.out.printf("%e%n", f);
		
		double d = 1.23456789;
		System.out.printf("%g%n", d);
		System.out.printf("%g%n", 0.00000001);
		
		System.out.printf("[%5d]%n", 10); //[   10]
		System.out.printf("[%5d]%n", 1234567); //[1234567]
		System.out.printf("[%-5d]%n", 10);//[10   ]
		System.out.printf("[%05d]%n", 10);//[00010]
		
		String url ="http://naver.com";
		System.out.printf("[%s]%n", url);   //[http://naver.com]
		System.out.printf("[%20s]%n", url); //[    http://naver.com]
		System.out.printf("[%.8s]%n", url); //[http://n]
		
	}
}
