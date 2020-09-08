class MyException extends Exception {
	private final int ERR_CODE; 
	
	MyException(String msg, int errCode) {
		super(msg);
		ERR_CODE = errCode;
	}
	MyException(String msg) {
		this(msg, 100);
	}
	public int getErrCode(){
		return ERR_CODE;
	}
}

public class ExceptionEx09 {
	public static void main(String[]args){
		//사용자 정의 예외 만들기 
		//우리가 직접 예외 클래스를 정의할 수 있다 
		//조상은 Exception과 RuntimeException 중에서 선택 
		
			}
}
