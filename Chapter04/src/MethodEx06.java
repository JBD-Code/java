class Method06{
	int x; 
}

public class MethodEx06 {
	public static void main(String[]args){
		//�⺻�� �Ű����� - ������ ���� �б⸸ �� �� �ִ�(read only 
		//������ �Ű����� - ������ ���� �а� ������ �� �ִ�(read & write)
		
		Method06 method = new Method06();
		method.x=10; 
		System.out.println("main() : x = " +method.x );
		
		change(method.x);
		System.out.println("After change(method.x)");
		System.out.println("main() : x = " +method.x );
		
		change02(method);
		System.out.println("After change02(method)");
		System.out.println("main() : x = " +method.x );
	}
	static void change(int x){
		x =1000; 
		System.out.println("change() : x = " +x);
	}
	static void change02(Method06 method){
		method.x= 1000;
		System.out.println("change02() : x = " + method.x );
	}
}
