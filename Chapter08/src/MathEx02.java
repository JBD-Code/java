
public class MathEx02 {
	public static void main(String []args){
		//Math Class �޼��� 
		//static double min(double a, double b)
		//static float min(float a, float b)
		//static int min(int a, int b)
		//static long min(long a, long b)
		//�־��� �� ���� ���Ͽ� ���� ���� ��ȯ�Ѵ� 
		double d = Math.min(9.5, 9.5000001);
		System.out.println(d);
		int i = Math.min(4, -2);
		System.out.println(i);
		
		//static double random() 
		//0.0~1.0������ ������ double ���� ��ȯ�Ѵ� 
		int i1 = (int)(Math.random()*10)+1;
		System.out.println(i1);
		
		//static double rint(double a)
		//�־��� double ���� ���� ����� �������� double ������ ��ȯ�Ѵ� 
		//�� �� ���� ��� �ִ� ��(1.5, 2.5, 3.5...)�� ¦���� ��ȯ 
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
		//�Ҽ��� ù°�ڸ����� �ݿø��� ������(long)�� ��ȯ�Ѵ� 
		//�� ���� ����ִ� ���� �׻� ū ������ ��ȯ 
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
