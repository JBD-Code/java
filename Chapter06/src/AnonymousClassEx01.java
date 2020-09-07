
public class AnonymousClassEx01 {
	Object iv = new Object(){void method(){}}; // 익명 클래스 
	static Object cv = new Object(){void method(){}}; //익명 클래스
	
	void method() {
		Object lv = new Object() {void method(){}};//익명 클래스 
	}
	
	public static void main(String[]args){
		//anonymous class 
		//이름이 없는 일회용 클래스 정의와 생성을 동시에 한다 
		//new 조상클래스의 이름 () {
			//멤버 선언 
		//}
		
		//new 구현인터페이스이름() {
			//멤버 선언 
		//}
	}
}
