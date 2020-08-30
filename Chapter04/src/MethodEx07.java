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
		//객체 생성 없이 클래스 이름.메서드이름()으로 호출 
		//인스턴스 멤버(instance variable,, instance method)와 관련없는 작업을 하는 메섣 
		//메서드 내에서 인스턴수 변수 사용 불가 
		
		
		//instance method 
		//인스턴스 생성후, 참조변수.메서드 이름()으로 호출 
		//인스턴스 멤버(instance variable,, instance method)와 관련한 작업을 하는 메서드 
		//메서드 내에서  인스터스 변수 사용가능 

		//static 은 속성중 공통 속성에 static를 사용 
		//instance variable, method를 사용하지 않는 method에 static를 사용
		
		System.out.println(Method07.add(3L, 4L));
		Method07 method = new Method07();
		
		method.a= 200L;
		method.b= 300L;
		
		System.out.println(method.add());
	}
}
