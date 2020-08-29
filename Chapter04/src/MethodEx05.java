class Method05{
	int mul(int x, int y){
		int result = x * y;
		return result; 
		
	}
	
	int max(int a, int b){
		if (a > b){
			return a; 
		}else {
			return b;
		}
	}
	
}


public class MethodEx05 {
	public static void main(String[]args){
		
		Method05 method = new Method05();
	
		int mul = method.mul(3, 5);
		int max = method.max(4, 16);

		System.out.println(mul);
		System.out.println(max);
	}
}
