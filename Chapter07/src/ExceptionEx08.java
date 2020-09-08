
public class ExceptionEx08 {
	public static void main(String[]args) throws Exception {
		//method에 예외 선언하기 
		//예외를 선언하는 방법  
		//1. try-catch 
		//2. 예외 선언하기 
		//3. 은폐 하기(무시) 
		//메서드가 호출시 발생가능한 예외를 호출하는 쪽에 알리는 것 
		method1();
	}
	static void method1() throws Exception {
		method2();
	}
	
	static void method2() throws Exception {
		throw new Exception();
	}
}
