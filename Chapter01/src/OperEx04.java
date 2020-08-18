
public class OperEx04 {
	public static void main(String[]args){
		
		int a =10; 
		int b =4; 
		System.out.printf("%d + %d =%d%n",a ,b, a+b);
		System.out.printf("%d - %d =%d%n",a ,b, a-b);
		System.out.printf("%d * %d =%d%n",a ,b, a*b);
		System.out.printf("%d / %d =%d%n",a ,b, a/b);
		System.out.printf("%d / %f =%f%n",a ,(float)b, a/(float)b);
		
		//산술 변환 
		//연산 전에 피연산자의 타입을 일치시키는 것 
		//두 피연산자의 타입을 같게 일치시킨다(보다 큰 타입으로 일치, 값 손실을 줄이기 위함)
		//long + int -> long + long -> long
		//float + int -> float + float -> float
		//double +float -> double + double -> double 
		
		//피연산자의 타입이 int 보다 작은 타입이면 int호 변환 
		//byte + short -> int + int -> int 
		//char + short -> int + int -> int 
		
		char c01 = '2'; //50
		char c02 = '0'; //48
		System.out.println(c01-c02);
		
		a = 1_000_000;
		b = 2_000_000;
		
		long c =(long)a * b; 
		//long c =a * (long)b; 
		System.out.println(c);
		
		//반올림 -Math.rount() 
		//실수를 소수점 첫 째 자리에서 반올림하여 정수를 변환 
		
		long result = Math.round(4.52);
		System.out.println(result);
		
		double pi = 3.141592; 
		double shortPi = Math.round(pi*1000)/1000.0;
		//double shortPi = Math.round(pi*1000)/1000;
		System.out.println(shortPi);
		
		//나머지 연산자 
		
		int x = 10;
		int y = 8 ;
		System.out.printf("%d를 %d로 나누면 %n", x, y);
		System.out.printf("몫은 %d이고 나머지는 %d입니다 %n", x/y, x%y);
		
		//비교 연산자 
		//두 피연산자를 비교해서 true 또는 false를 반환 
		System.out.println('A' > 'B');// 65> 66
		
		//문자열의 비교에는 "=="대신에 equals()를 사용해야 한다 
		String str01 = "abc";
		String str02 = "abc";
		System.out.println(str01==str02);
		System.out.println(str01.equals(str02));
		
		String str03 = new String("abc");
		String str04 = new String("abc");
		System.out.println(str03 == str04);//false 
		System.out.println(str03.equals(str04));
		
		
		//논리 연산자 
		//조건식을 연결할 때 사용하는 연산자 
		// ||(OR결합) 피연산자 중 어느 한쪽이 true 이면 true를 얻는다 
		// &&(AND겷합) 피연산자 양쪽 모두 true 이어야 true를 얻는다 
		
		x = 10; 
		y = 20; 
		System.out.println(10 < x && x < 20 );
		
		//x는 2의 배수 또는 3의 배수이다 
		System.out.println(x%2==0 || x%3==0);
		
		//x는 2의 배수 또는 3의 배수지만 6의 배수는 아니다 
		//아래의 수식에 괄호를 사용한 이유는 "&&"가 "||"보다 우선 순위가 높기 때문이다 
		System.out.println((x%2==0||x%3==0)&&x%6!=0);
		
		//문자 c03는 숫자('0'~'9')이다 
		char c03 = '5'; 
		System.out.println('0'<=c03 && c03 <='9');
		
		//문자 c03는 대문자 또는 소문자 이다 
		c03 = 'z';
		System.out.println(('a'<=c03 && c03 <='z')||('A'<=c03&&c03<='Z'));
		
		
		//논리 부정 연산자 ! 
		//true를 false로 false 를 true로 바뀬다 
		boolean b01 =true; 
		System.out.println(!!b01);
		
		//문자 c03은 소문자가 아니다 
		System.out.println(!('a'<=c03 && c03<='x')); 
		
	}	
}
