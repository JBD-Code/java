
public class VarEx04 {
	public static void main(String[]args){

	//1 ����ȭ�� ��� 		
		//1 println()�� ���� - ��� ���� ���� �Ұ� 
		//�Ǽ��� �ڸ��� ���� �Ұ� 
		System.out.println(10/3); //3 
		System.out.println(10.0/3); //3.3333333333333335
		//2 10�����θ� ����Ѵ� - 8���� 16������ ����� ��� 
		System.out.println(0x1A);
		
		//2 printf()�� ��� ���� ���� ���� 
		System.out.printf("%.2f", 10.0/3);//3.33
		System.out.printf("%d%n", 0x1A); //26
		System.out.printf("%x%n", 0x1A); //1a
		/*
		printf()�� ������ 
		%b 			boolean �������� ��� 
		%d 			decimal ������ �������� ��� 
		%o 			octal ������ �������� ��� 
		%x, %X 		hexa-decimal ������ �������� ��� 
		%f			�ε��Ҽ��� (floationg-point  	 			
		%c 			����(character)�� ��� 
		%s			���ڿ� (String)�� ���
		*/
		
		System.out.printf("\nage:%d year:%d\n", 14 ,2017);
		System.out.printf("%d%n", 15);//10����
		System.out.printf("%o%n", 15);//8����
		System.out.printf("%x%n", 15);//16���� 
		System.out.printf("%s%n", Integer.toBinaryString(15)); //1111 2����
	
		//8������ 16������ ���λ� ���̱� 
		System.out.printf("%#o%n", 15); //017
		System.out.printf("%#x%n", 15); //0xf
		System.out.printf("%#X%n", 15); //0XF
		
		//�Ǽ� ����� ���� ������ %�� - �������� (%e), ������ ����(%g)
		float f = 124.4567890f; 
		System.out.printf("%f%n", f);
		System.out.printf("%e%n", f);
		
		double d = 1.23456789;
		System.out.printf("%g%n", d);
		System.out.printf("%g%n", 0.00000001);
		
		System.out.printf("[%5d]%n", 10); //[   10]
		System.out.printf("[%5d]%n", 1234567); //[1234567]
		System.out.printf("[%-5d]%n", 10);//[10   ]
		System.out.printf("[%05d]%n", 10);//[00010]
		
		String url ="http://naver.com";
		System.out.printf("[%s]%n", url);   //[http://naver.com]
		System.out.printf("[%20s]%n", url); //[    http://naver.com]
		System.out.printf("[%.8s]%n", url); //[http://n]
		
	}
}
