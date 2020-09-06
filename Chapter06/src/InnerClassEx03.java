
public class InnerClassEx03 {

	class InstanceInner{}
	static class StaticInner{}
	
	InstanceInner iv = new InstanceInner();
	static StaticInner cv = new StaticInner();

	static void staticMethod () {
		//InstanceInner obj1 = new InstanceInner();	Error 
		StaticInner obj2 = new StaticInner(); 
	}
	
	void instanceMethod() {
		InstanceInner obj1 = new InstanceInner(); 
		StaticInner obj2 = new StaticInner();
		//LocalInner lv = new LocalInner();	Error 
	}
	void myMethod(){
		class LocalInner{}
		LocalInner iv = new LocalInner();
	}
	
	public static void main(String []args){
		
	}
}
