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
		//method 이름이 같아야 한다 
		//매개변수의 개수 타입이 달라야 한다 
		//반환타입은 영향 없다 
		
		Method09 mm = new Method09(); 
		long result =mm.div(3, 3L);
		long result02 =mm.div(3L, 3);
		System.out.println(result);
		System.out.println(result02);
	}
}
