
public class OperEx03 {
	public static void main(String[]args){
	//형변환 연산자 
		//형변환이란 변수 또는 상수의 타입을 다른 타입으로 변환하는 것 
		
		double d = 85.4; 
		int score = (int)d;
		System.out.println(d);
		System.out.println(score);
		
		int a = 65;
		char c = 'A';
		
		System.out.println((char)a);
		System.out.println((int)c);
		
		float f = 1.6f; 
		int b = 10; 
		System.out.println((int)f);
		System.out.println((float)b);
	
		//자동 형변환 
		f=1234; //컴파일러에 의한 자동 형변환  
		//f=(float)1234;   
		System.out.println(f);
		
		//수동 형변환 
		int i = (int)3.14f; //값손실이 발생할 수 있기 때문에 직접 형변환 
		System.out.println(i);
		
		//byte -> int 
		byte num01 = 10; 
		i = b;
		System.out.println(i);
		
		i= 300;
		num01 =(byte)i;
		System.out.println(num01);
		
		//1byte   2byte	  4byte	  8byte    4byte     8byte			 
		//byte -> short -> int ->  long -> float -> double 
				 //char	
		
		byte b01 = 100 ; //byte 타입의 범위 (-128 ~127)의 값의 대입 
		
		i=100; 
		//b01 = i; //Error  
		b01 =(byte)i; //Error  
		
	}
}
