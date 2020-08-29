class Method06{
	int x; 
}

public class MethodEx06 {
	public static void main(String[]args){
		//기본형 매개변수 - 변수의 값을 읽기만 할 수 있다(read only 
		//참조형 매개변수 - 변수의 값을 읽고 변경할 수 있다(read & write)
		
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
