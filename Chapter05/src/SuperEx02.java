class Parent07{
	int x = 10; 
}

class Child07 extends Parent07 {
	void method () {
		System.out.println("x="+x);
		System.out.println("this.x="+this.x);
		System.out.println("super.x="+super.x);
	}
}
public class SuperEx02 {
	public static void main(String[]args){
		Child07 c = new Child07(); 
		c.method();
	}
}
