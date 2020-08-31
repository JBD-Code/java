class Parent06{
	int x = 10 ; 
}
class Child06 extends Parent06{
	int x =20; 
	
	void method(){
		System.out.println("x=" +x);
		System.out.println("this.x=" +this.x);
		System.out.println("super.x=" +super.x);
	}
	
}
public class SuperEx01 {
	public static void main(String[]args){
		//참조변수 super 
		//객체 자신을 가리키는 참조 변수, instance method(셍성자)내에서만 존재 
		//조상의  멤버를 자신의 멤버와 구별할 때 사용 
		Child06 c = new Child06(); 
		c.method();
	}
}
