
public class ExceptionEx10 {
	public static void main(String[]args){
		//예외 되던지기 (Exception re-throwing) 
		//예외를 처리한 후 다시 예외를 발생시키는 것 
		//호출한 메서드와 호출된 메서드 양쪽 모두에서 예외를 처리하는 것 
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main 메서드에서 예외가 처리 되었습니다");
			e.printStackTrace();
		}
	}
	static void method1() throws Exception {
		try {
			throw new Exception(); //예외 발생
		}catch (Exception e) {
			System.out.println("method1 메서드에서 예외가 처리 되었습니다");
			//try - catch 로 예외 처리 	
			throw e;  // 다시 예외 발생시켜서 main 메서드로 던짐  
		}
	}
}
