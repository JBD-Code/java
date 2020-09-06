class Outer05 {
	class InstanceInner {
		int iv = 100; 
		
	}
	static class StatincInner{
		int iv = 200; 
		static int cv = 300; 
		
	}
	void myMethod() {
		class LocalInner{
			int iv = 400; 
		}
	}
}
public class InnerClassEx05 {
	public static void miin(String[]args){
		Outer05 oc = new Outer05(); 
		Outer05.InstanceInner ii = oc.new InstanceInner();
		
		System.out.println("ii.iv :" + ii.iv);
		System.out.println("Outer05.StaticInner.cv :" + Outer05.StatincInner.cv);

		Outer05.StatincInner si = new Outer05.StatincInner();
		System.out.println("si.iv:" +si.iv);
	
	}
}
