class Method09 {

	int add(int a, int b) {
		return a + b;
	}
	//int add(int x, int y){
	//	return x + y;
	//}
	
	//long add(int a, int b) {
	//	return a + b;
	//}
	
	long div(int x, long y) {
		return x / y ; 
	}

	long div(long x, int y) {
		return x / y ; 
	}
}


public class MethodEx09 {
	public static void main(String[]args){
		//overloading 
		//method �̸��� ���ƾ� �Ѵ� 
		//�Ű������� ���� Ÿ���� �޶�� �Ѵ� 
		//��ȯŸ���� ���� ���� 
		
		Method09 mm = new Method09(); 
		long result =mm.div(3, 3L);
		long result02 =mm.div(3L, 3);
		System.out.println(result);
		System.out.println(result02);
	}
}
