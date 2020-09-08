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
		//����� ���� ���� ����� 
		//�츮�� ���� ���� Ŭ������ ������ �� �ִ� 
		//������ Exception�� RuntimeException �߿��� ���� 
		
			}
}
