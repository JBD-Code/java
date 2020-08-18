
public class OperEx01 {
	public static void main(String[]args){
	//연산자와 피연산자 
		//연산자 : 연산을 수행하는 기호 (+, -, *, /) 
		//피연산자 : 연산자의 연산 수행 대상 
		//모든 연산자는 연산 결과를 반환한다 
		int x =5;
		int y =4; 
		int z =3;
		System.out.println(x*y+z);
		
		//연산자의 종류 
		//산술 연산자 	+ , - , * , / , % , << , >>
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		System.out.println(x>>y);
		System.out.println(x<<y);
		
		//비교 연산자     > , < , >= , <=, == , !=
		System.out.println(x+3 > y-2);
		//논리 연산자     && , ||,	!, & , | , ^ , ~ 
		System.out.println(x>3 && x< 5);
		System.out.println(x>3 || x< 5);

		//대입 연산자  	=
		//기타 연산자  	형변환 연산자, 삼항 연산자, instanceof 연산자 
	
		//연산자의 우선순위 
		//하나의 식에 연산자가 둘 이상 있을 때 어떤 연산자를 먼저 수행하질 자동 결정하는 것 
		
		System.out.println(x+y*z);
		System.out.println((x+y)*z);
		System.out.println("-x+3="+(-x + 3));
		System.out.println("x+3*y="+(-x+3*y));
		
		//연산자의 결합 규칙 
		//우선 순위가 같은 연산자가 있을 경우에는 대입과 단항 연산자를 제외하면 모두 왼쪽 에서 오른쪽으로 수행
		//산술> 비교 > 논리 > 대입  대입이 가장 마지막에 수행 
		//단항 > 이항 > 삼항 > 단항 연산자의 우선순위와 이항 연산자 보다 높다 

		//증감 연산자 
		//증가 연산자(++) 피연산자의 값을 1 증가 시킨다 
		//감소 연산자(--) 피연사의 값을 1 감소 시킨다 
		//전위형 값이 참조되기 전에 증가 시킨다  j = ++i; 
		//후위형 값이 참조된 후에 증가 시킨다     j = i++;
		
		//증감 연산자가 독립적으로 사용된 경우에는 전위형과 후위형의 차이가 없다 
		
		
	}
}
