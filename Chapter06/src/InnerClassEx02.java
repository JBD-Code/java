
public class InnerClassEx02  {
	class InstanceInner{
		int iv =100; 
		//static int cv = 100; Error static 변수 선언 불가 
		final static int CONST =100; //final static은 상수이므로 가능 
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv = 300; //static 클래스이므로 static 멤버를 정의 가능 
		
	}
	void method(){
		class LocalInner{
			int iv = 300; 
			//static int cv = 400; Error static 변수 선언 불가  
			final static int CONST = 500; //final static은 상수이므로 가능
		}
	}

	public static void main(String[]args){
		//Inner class의 제어자와 접근성 
		//private, default, protected, public 사용 가능 
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
		//System.out.println(LocalInner.CONST);
	}
}
