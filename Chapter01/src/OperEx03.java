
public class OperEx03 {
	public static void main(String[]args){
	//����ȯ ������ 
		//����ȯ�̶� ���� �Ǵ� ����� Ÿ���� �ٸ� Ÿ������ ��ȯ�ϴ� �� 
		
		double d = 85.4; 
		int score = (int)d;
		System.out.println(d);
		System.out.println(score);
		
		int a = 65;
		char c = 'A';
		
		System.out.println((char)a);
		System.out.println((int)c);
		
		float f = 1.6f; 
		int b = 10; 
		System.out.println((int)f);
		System.out.println((float)b);
	
		//�ڵ� ����ȯ 
		f=1234; //�����Ϸ��� ���� �ڵ� ����ȯ  
		//f=(float)1234;   
		System.out.println(f);
		
		//���� ����ȯ 
		int i = (int)3.14f; //���ս��� �߻��� �� �ֱ� ������ ���� ����ȯ 
		System.out.println(i);
		
		//byte -> int 
		byte num01 = 10; 
		i = b;
		System.out.println(i);
		
		i= 300;
		num01 =(byte)i;
		System.out.println(num01);
		
		//1byte   2byte	  4byte	  8byte    4byte     8byte			 
		//byte -> short -> int ->  long -> float -> double 
				 //char	
		
		byte b01 = 100 ; //byte Ÿ���� ���� (-128 ~127)�� ���� ���� 
		
		i=100; 
		//b01 = i; //Error  
		b01 =(byte)i; //Error  
		
	}
}
