
public class ExceptionEx06 {
	public static void main(String[]args){
		//checked 예외 unchecked예외 
		//checked 예외 : 컴파일러가 예외 처리 여부를 체크(예외 처리 필수) Exception class 자손  
		//unchecked 예외 : 컴파일러가 예외 처리 여부를 체크 하지 않음 ( 예외 처리 선택) RuntimeException class 자손
		
		try {
			//Exception과 그 자손은 반드시 예외 처리를 해야 한다(필수)
			throw new Exception(); //Exception을 고의로 발생 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			//RumtimeException과 그 자손은 예외처리를 해주지 않아도 컴파일이 가능하다(선택)
		throw new RuntimeException();
	}
}
