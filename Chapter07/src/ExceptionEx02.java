
public class ExceptionEx02 {
	public static void main(String []args){
		//try-catch
		
		//정의 프로그램 실행 시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것 
		//목적 프로그램 비정상 종료를 막고, 정상적인 실행 상태를 유지하는 것 
		
		//try {
			//예외가 발생할 가능성이 있는 문장들을 넣늗디 
		//} catch(Exception e1) {
			//Exception e1이 발생 했을 경우, 이를 처리하기 위한 문장을 적는다 
		//} catch(Exception e2) {
			//Exception e2이 발생 했을 경우, 이를 처리하기 위한 문장을 적는다 
		//} catch(Exception e3) {
			//Exception e3이 발생 했을 경우, 이를 처리하기 위한 문장을 적는다 
	
		//}
		System.out.println(1);
		try{
			System.out.println(2);
			System.out.println(3);

		}catch (Exception e) {
			System.out.println(4);
		}
		System.out.println(5);
		System.out.println("/////////////");
		//try 블럭 내에서 예외가 발생한 경우 
			//1. 발생한 예외와 일치하는 catch 블럭이 있는지 확인한다 
			//2. 일치하는 catch블럭을 찾게 되면 그 catch 블럭내의 문장을 수행하고 전체 try-catch문을
			//	 빠져나가서 그 다음 문장을 계속 수행한다. 만약 일치하는 catch블럭을 찾지 못하면 예외는 처리될 수 없다 
		
		//try 블럭 내에서 예외가 발생하지 않은 경우 
			//1. catch 블럭을 거치지 않고 전체 try-catch 문을 빠져나가서 수행을 계속 한다  
		System.out.println(1);
		try{
			System.out.println(0/0);
			System.out.println(2);
			System.out.println(3);
		}catch (Exception e) {
			System.out.println(4);
		}
		System.out.println(5);
		
		
		
	}
}
