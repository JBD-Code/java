
public class MathEx01 {
	public static void main(String[]args){
		//Math Class �޼��� 
		//static double abs(double a)
		//static float  abs(float f)
		//static int	abs(int f)
		//static long 	abs(long f) 
		//�־��� ���� ���밪�� ��ȯ
		
		int i = Math.abs(-10);
		double d = Math.abs(-10.0);
		System.out.println(i);
		System.out.println(d);
		
		//static double ceil(double a)
		//�־��� ���� �ø��Ͽ� ��ȯ�Ѵ� 
		double d1 = Math.ceil(10.1);
		double d2 = Math.ceil(-10.1);
		double d3 = Math.ceil(10.000015);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		//static double floor(double a) 
		//�־��� ���� �����Ͽ� ��ȯ�Ѵ� 
		double d4 = Math.floor(10.8);
		double d5 = Math.floor(-10.8);
		System.out.println(d4);
		System.out.println(d5);
		
		//static double max(double a, double b)
		//static float max(float a, float b
		//static int max(int a, int b)
		//static long max(long a, long b) 
		//�־��� �� ���� ���Ͽ� ū ���� ��ȯ�Ѵ� 
		
		double maxNum1 = Math.max(9.5, 9.500001);
		System.out.println(maxNum1);
		int maxNum2 = Math.max(0, -3);
		System.out.println(maxNum2);
		
		
	}
}
