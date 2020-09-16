
public class MathEx02 {
	public static void main(String []args){
		//Math Class 메서드 
		//static double min(double a, double b)
		//static float min(float a, float b)
		//static int min(int a, int b)
		//static long min(long a, long b)
		//주어진 두 값을 비교하여 작은 쪽을 반환한다 
		double d = Math.min(9.5, 9.5000001);
		System.out.println(d);
		int i = Math.min(4, -2);
		System.out.println(i);
		
		//static double random() 
		//0.0~1.0범위의 임의의 double 값을 반환한다 
		int i1 = (int)(Math.random()*10)+1;
		System.out.println(i1);
		
		//static double rint(double a)
		//주어진 double 값과 가장 가까운 정수값을 double 형으로 반환한다 
		//단 두 정수 가운데 있는 값(1.5, 2.5, 3.5...)은 짝수를 반환 
		double d1 = Math.rint(1.2);
		double d2 = Math.rint(3.8);
		double d3 = Math.rint(4.1);
		double d4 = Math.rint(5.6);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		
		//static long round(double a) 
		//static long round(float a) 
		//소수점 첫째자리에서 반올림한 정수값(long)을 반환한다 
		//두 정수 가운데있는 값은 항상 큰 정수를 반환 
		long l = Math.round(1.2);
		long l2 = Math.round(2.6);
		long l3 = Math.round(3.5);
		long l4 = Math.round(1.5);
		System.out.println(l);
		System.out.println(l2);
		System.out.println(l3);
		System.out.println(l4);
		
	}
}
