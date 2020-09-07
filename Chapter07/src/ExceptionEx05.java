
public class ExceptionEx05 {
	public static void main(String[]args){
		//예외 발생시키기 
		//1. 연산자 new 를 이용해서 발생시키려는 예외 클래스의 객체를 만든 다음
		//	 Exception e = new Exception("고의로 예외 발생");
		//2. 키워드 throw를 이용해서 예외를 발생시킨다 
		//	 throw e ; 
		
		try {
			Exception e = new Exception("고의로 예외 발생");
			throw e ;  //예외를 발생시킴 
			
		} catch (Exception e) {
			System.out.println("Error Message " +e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료되었음");
		
		
	
	}
}
