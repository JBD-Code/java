class Method07{
	long a, b ; 
	
	long add() {
		return a +b; 
	}
	static long add(long a, long b){
		return a + b; 
	}
		
	
}


public class MethodEx07 {
	public static void main(String[]args){
		//static method 
		//��ü ���� ���� Ŭ���� �̸�.�޼����̸�()���� ȣ�� 
		//�ν��Ͻ� ���(instance variable,, instance method)�� ���þ��� �۾��� �ϴ� �޼� 
		//�޼��� ������ �ν��ϼ� ���� ��� �Ұ� 
		
		
		//instance method 
		//�ν��Ͻ� ������, ��������.�޼��� �̸�()���� ȣ�� 
		//�ν��Ͻ� ���(instance variable,, instance method)�� ������ �۾��� �ϴ� �޼��� 
		//�޼��� ������  �ν��ͽ� ���� ��밡�� 

		//static �� �Ӽ��� ���� �Ӽ��� static�� ��� 
		//instance variable, method�� ������� �ʴ� method�� static�� ���
		
		System.out.println(Method07.add(3L, 4L));
		Method07 method = new Method07();
		
		method.a= 200L;
		method.b= 300L;
		
		System.out.println(method.add());
	}
}
