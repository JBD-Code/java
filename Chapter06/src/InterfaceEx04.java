class A3{
	void methodA(){
		In03 i = InstanceManager.getInstance();
		i.methodB();
		System.out.println(i.toString());
	}
}
interface In03{
	public abstract void methodB();
}
class B3 implements In03{
	public void methodB(){
		System.out.println("MethodB in B3 class");
	}
	
	public String toString(){
		return "class B3";
	}
}
class InstanceManager{
	public static In03 getInstance(){
		return new B3();
	}
}
public class InterfaceEx04 {
	public static void main(String[]args){
		A3 a = new A3();
		a.methodA();
	}
}
