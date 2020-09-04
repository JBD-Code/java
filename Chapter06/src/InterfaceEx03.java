class A2{
	void autoPlay(In i){
		i.play();
	}
}
interface In{
	public abstract void play(); 
}
class B2 implements In {
	public void play(){
		System.out.println("play in B class");
	}
}
class C2 implements In {
	public void play(){
		System.out.println("Play in C class");
	}
}
public class InterfaceEx03 {
	public static void main(String[]args){
		//인터페이스의 장점 
		//두 대상(객체)간의 연결, 대화, 소통을 돕는 중간 역할을 한다 
		//선언과 구현을 분리시킬 수 있다 
		
		//개발 시간을 단축할 수 있다 
		//변경에 유리한 설계 
		//표준화가 가능하다 
		//서로 관계 없는 클래스들의 관계를 맺어줄 수 있다 
		
	
		A2 a = new A2();
		a.autoPlay(new B2());
		a.autoPlay(new C2());
	}
}
