
public class OperEx05 {
	public static void main(String[]args){
		//조건 연산자 ? 
		//조건식의 결과에 따라 연산 결과를 달리한다.
		int x=10, y=20; 
		int result = (x>y)? x: y;
		System.out.println(result);
		
		//대입연산자 
		//오른쪽 피연산자를 왼쪽 피연산자에 저장후 저장된 값을 반환 
		System.out.println(x=4);

		//lvalue - 대입 연산자의 왼쪽 피연산자 
		//rvalue - 대입 연산자의 오른쪽 피연산자 
		// x (lvalue) = 3 (rvalue)
		
		
		//복합 대입 연산자 
		int i = 5; 
		int j = 4; 
		
		System.out.println(i+=3);
		System.out.println(i-=3);
		System.out.println(i*=3);
		System.out.println(i/=3);
		System.out.println(i%=3);
		System.out.println(i<<=3);
		System.out.println(i>>=3);
		System.out.println(i>>=3);
		System.out.println(i&=3);
		System.out.println(i^=3);
		System.out.println(i|=3); 
		System.out.println(i*=(10+j));
		
	}
}
