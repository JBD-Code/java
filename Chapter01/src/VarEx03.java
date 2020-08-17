
public class VarEx03 {
	public static void main(String[]args){
		//두 변수의 값 교환하기 
		int x =10, y=20; 
		int tmp; 
		System.out.println("x=" +x);
		System.out.println("y=" +y);
		tmp=x; 
		x=y;
		y=tmp;
		System.out.println("x=" +x);
		System.out.println("y=" +y);
		
		
		//기본형과 참조형 
			
			// Primitive type 
			// boolean, char, byte, short, int , long , float, double
			// 실제 값을 저장 
			
			// Reference type 
			// Primitive type를 제외한 나머지 
			// 메모리 주소를 저장 (32bit JVM : 4byte  64bit JVM :8byte) 
			
		//Primitive type
			//논리형 - true 와 false 중 하나의 값을 가지며 조건식과 논리적 연산에 사용
			//문자형 - 문자를 저장하는데 사용하며, 변수당 하나의 문자만을 저장할 수 있다 
			//정수형 - 정수 값을 저장하는데 사용하며 주로 사용하는 것은 int 와 long
				 //- byte는 이진데이터를 다루는데 사용한다 
				 //- short은 C 언어와의 호환을 위해 추가 되었다   
		 	//실수형 - 실수값을 저정하는데 사용된다 float와 double이 있다 
		
		
	
	}
}
