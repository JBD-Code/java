
public class ExceptionEx04 {
	public static void main(String[]args){
		//printStackTrace() getMessage() 
		//printStackTrace() 
		//예외 발생 당시의 호출 스택에 있었던 메서드의 정보와 예외메시지를 화면에 출력 
		//getMessage() 
		//발생한 예외 클래스의 인스턴스에 저장된 메시지를 얻을 수 있다 
		
		System.out.println(1);
		System.out.println(2);
		try{
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
			
		}catch (ArithmeticException ae) {
			ae.getStackTrace();
			System.out.println("Exception Message" + ae.getMessage());
		}
		System.out.println(5);
		
	}
}
