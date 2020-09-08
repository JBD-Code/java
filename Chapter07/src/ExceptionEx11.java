

public class ExceptionEx11 {
	public static void main(String[]args){
		
		//Chained Exception 연결된 예외 
		//한 예외가 다른 예외를 발생시킬 수 있다 
		//예외 A가 예외 B를 발생 시키면 A는 B의 원인 예외 (cause Exception)
		//연결된 예외를 사용하는 이유 
			//1. 여러 예외를 하나로 묶어서 다루기 위함 
			//2. checked(필수 처리)예외를  unchecked(선택 처리) 예외로 변경하러 할 뗴
		//Throwable initCause(Throwable cause) 지정한 원인 예외로 등록 
		//Throwable getCause 원인 예외를 반환 
		
		
	}
}
