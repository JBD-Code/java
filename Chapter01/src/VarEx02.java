
public class VarEx02 {
	public static void main(String[]args){
		
		//variable �ϳ��� ���� �����ϱ� ���� ����
		//constant �ѹ��� ���� ���� ������ ���� 
		//literal  �� ��ü�� ���� �ǹ��ϴ� �� 
		
		//int score = 100; 
		//System.out.println(score);
		
		//score = 200; 
		//System.out.println(score);
		
		final int score ;
		score=200; 
		System.out.println(score);
		
		
		//literal�� ���λ� ���̻� 
		//���λ�� ���̻�� ��ҹ��ڸ� �������� �ʴ´� 
		boolean power = true; 
		System.out.println(power);
		byte b = 127; // -128 ~ 127 
		
		int oct = 010; // 8���� , 10������ 8
		int hex = 0x10; // 16����, 10������ 16
		System.out.println(oct);
		System.out.println(hex);
		
		//long l = 1000_000_000;
		long l = 10_000_000_000L;
		
		float f = 3.14f; 
		double d = 3.14f;
		
		char ch = 'A'; 
		String str = "ABC"; 
		
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3);
		
		// ������ ���ͷ� Ÿ���� ����ġ 
		// 1 ������ variable > literal �� ��쿡�� ���� �ϴ� 
		//int i ='A';   // int >char 
		//long l = 123; // long > int
		//double d = 3.14f; //double > float 
		
		// 2 ������ variable > literal �� ��쿡�� �Ұ����ϴ� 
		// 3 byte, short ������ int literal ������ �����ϴ� 
	
		
		//���ڿ� ���ڿ� 
		char ch01 = 'A'; 
		//char ch01 = 'AB'; //Error �߻� 
		//char ch02 = '';   //Error �߻� 
		String s = "ABC"; 
		
		String s1 = "AB"; 
		String s2 = new String("AB");
		
		String s3 = "A"; 
		String s4 = ""; //�� ���ڿ� 
		
		String s5 = "A" + "B"; 
		System.out.println(s5);
		System.out.println("" + 7 +7);
		System.out.println(7 + 7 +"");
		
		int i = 'A';
		System.out.println(i);
	}
}
