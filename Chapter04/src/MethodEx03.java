class MyMath{
	
	long add(long a, long b) {
		return a+b ; 
		  
	}
	long sub(long a, long b) {
		return a-b ; 
	}
	long mul(long a, long b) {
		return a*b ; 
	}
	double div(double a, double b) {
		return (double)(a / b) ; 
	}
}

public class MethodEx03 {
	public static void main(String[]args){
		MyMath math = new MyMath(); 
		long addResult = math.add(3L, 5L);
		System.out.println(addResult);
		System.out.println(math.add(5L, 3L));
		
		long subResult = math.sub(5L, 3L);
		System.out.println(subResult);
		System.out.println(math.sub(5L, 3L));
	
		long mulResult = math.mul(5L, 3L);	
		System.out.println(mulResult);
		System.out.println(math.mul(5L, 3L));
		
		double divResult = (math.div(5L, 3L));
		System.out.println(divResult);
		System.out.println(math.div(5L, 3L));
	
	}
}
