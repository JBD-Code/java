
public class OperEx04 {
	public static void main(String[]args){
		
		int a =10; 
		int b =4; 
		System.out.printf("%d + %d =%d%n",a ,b, a+b);
		System.out.printf("%d - %d =%d%n",a ,b, a-b);
		System.out.printf("%d * %d =%d%n",a ,b, a*b);
		System.out.printf("%d / %d =%d%n",a ,b, a/b);
		System.out.printf("%d / %f =%f%n",a ,(float)b, a/(float)b);
		
		//��� ��ȯ 
		//���� ���� �ǿ������� Ÿ���� ��ġ��Ű�� �� 
		//�� �ǿ������� Ÿ���� ���� ��ġ��Ų��(���� ū Ÿ������ ��ġ, �� �ս��� ���̱� ����)
		//long + int -> long + long -> long
		//float + int -> float + float -> float
		//double +float -> double + double -> double 
		
		//�ǿ������� Ÿ���� int ���� ���� Ÿ���̸� intȣ ��ȯ 
		//byte + short -> int + int -> int 
		//char + short -> int + int -> int 
		
		char c01 = '2'; //50
		char c02 = '0'; //48
		System.out.println(c01-c02);
		
		a = 1_000_000;
		b = 2_000_000;
		
		long c =(long)a * b; 
		//long c =a * (long)b; 
		System.out.println(c);
		
		//�ݿø� -Math.rount() 
		//�Ǽ��� �Ҽ��� ù ° �ڸ����� �ݿø��Ͽ� ������ ��ȯ 
		
		long result = Math.round(4.52);
		System.out.println(result);
		
		double pi = 3.141592; 
		double shortPi = Math.round(pi*1000)/1000.0;
		//double shortPi = Math.round(pi*1000)/1000;
		System.out.println(shortPi);
		
		//������ ������ 
		
		int x = 10;
		int y = 8 ;
		System.out.printf("%d�� %d�� ������ %n", x, y);
		System.out.printf("���� %d�̰� �������� %d�Դϴ� %n", x/y, x%y);
		
		//�� ������ 
		//�� �ǿ����ڸ� ���ؼ� true �Ǵ� false�� ��ȯ 
		System.out.println('A' > 'B');// 65> 66
		
		//���ڿ��� �񱳿��� "=="��ſ� equals()�� ����ؾ� �Ѵ� 
		String str01 = "abc";
		String str02 = "abc";
		System.out.println(str01==str02);
		System.out.println(str01.equals(str02));
		
		String str03 = new String("abc");
		String str04 = new String("abc");
		System.out.println(str03 == str04);//false 
		System.out.println(str03.equals(str04));
		
		
		//�� ������ 
		//���ǽ��� ������ �� ����ϴ� ������ 
		// ||(OR����) �ǿ����� �� ��� ������ true �̸� true�� ��´� 
		// &&(AND����) �ǿ����� ���� ��� true �̾�� true�� ��´� 
		
		x = 10; 
		y = 20; 
		System.out.println(10 < x && x < 20 );
		
		//x�� 2�� ��� �Ǵ� 3�� ����̴� 
		System.out.println(x%2==0 || x%3==0);
		
		//x�� 2�� ��� �Ǵ� 3�� ������� 6�� ����� �ƴϴ� 
		//�Ʒ��� ���Ŀ� ��ȣ�� ����� ������ "&&"�� "||"���� �켱 ������ ���� �����̴� 
		System.out.println((x%2==0||x%3==0)&&x%6!=0);
		
		//���� c03�� ����('0'~'9')�̴� 
		char c03 = '5'; 
		System.out.println('0'<=c03 && c03 <='9');
		
		//���� c03�� �빮�� �Ǵ� �ҹ��� �̴� 
		c03 = 'z';
		System.out.println(('a'<=c03 && c03 <='z')||('A'<=c03&&c03<='Z'));
		
		
		//�� ���� ������ ! 
		//true�� false�� false �� true�� �م��� 
		boolean b01 =true; 
		System.out.println(!!b01);
		
		//���� c03�� �ҹ��ڰ� �ƴϴ� 
		System.out.println(!('a'<=c03 && c03<='x')); 
		
	}	
}
