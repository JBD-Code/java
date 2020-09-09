
public class ObjectClassEx01 {
	public static void main(String[]args){
		//Object class 
		//모든 클래스의 최고 조상 11 개의 method 를 가지고 있다 
		//notify(), wait() 등으 thread와 관련된 method
		
		//Object 관련 method 
		//protected Objectt clone() 			객체 자신의 복사본을 반환 
		//public boolean equals(Object obj)		객체 자신과 객체 obj가 같은 객체인지 알려준다 
		//protected void finalize()				객체가 소명할 때 가비지 컬렉터에 의해 자동적으로 호출된다 이 때 수행되어야 하는
		//										코드가 있을 때 오버라이딩한다 
		//public Class getclass					객체 자신의 클래스 정보(설계도 정보)를 담고 있는 class 인스턴스를 반환한다 

		//public int hashCode()					객체 자신의 해시코드를 반환한다 
		//public String toString()				객체 자신의 정보를 문자열로 반환한다 

		//public void notify()					객체 자신을 사용하려고 기다리는 쓰레드를  하나만 때운다 
		//public void nofifyAll()				객체 자신을 사용하려고 기다리는 모든 쓰레드를 깨운다 
		//public void wait()					다른 쓰레드가 notify(), notifyAll()을 호출할 때 까지 현재 쓰레드는 무한히 또는 지정된 시간
		//public void wait(long timeout)		(timeout, nanos)동안 기다리게 한다 (timeout는 천분의 1초, nanos는 10³분의 1초)
		//public void wait(long timeout, nanos) 	
	
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2)){
			System.out.println("v1 과 v2는 같습니다 ");
		}else {
			System.out.println("v1 과 v2는 다릅니다  ");
		}
	}
}

class Value {
	int value; 
	
	Value(int value){
		this.value = value;
	}
	public boolean equals(Object obj){
		if(!(obj instanceof Value))return false;
		Value v = (Value)obj;
		return this.value == v.value;
	}
}
