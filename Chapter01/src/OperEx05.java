
public class OperEx05 {
	public static void main(String[]args){
		//���� ������ ? 
		//���ǽ��� ����� ���� ���� ����� �޸��Ѵ�.
		int x=10, y=20; 
		int result = (x>y)? x: y;
		System.out.println(result);
		
		//���Կ����� 
		//������ �ǿ����ڸ� ���� �ǿ����ڿ� ������ ����� ���� ��ȯ 
		System.out.println(x=4);

		//lvalue - ���� �������� ���� �ǿ����� 
		//rvalue - ���� �������� ������ �ǿ����� 
		// x (lvalue) = 3 (rvalue)
		
		
		//���� ���� ������ 
		int i = 5; 
		int j = 4; 
		
		System.out.println(i+=3);
		System.out.println(i-=3);
		System.out.println(i*=3);
		System.out.println(i/=3);
		System.out.println(i%=3);
		System.out.println(i<<=3);
		System.out.println(i>>=3);
		System.out.println(i>>=3);
		System.out.println(i&=3);
		System.out.println(i^=3);
		System.out.println(i|=3); 
		System.out.println(i*=(10+j));
		
	}
}
