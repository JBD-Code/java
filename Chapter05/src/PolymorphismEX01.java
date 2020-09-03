class Tv06{
	boolean power; 
	int channel; 
	
	void power () {
		power =!power; 
	}
	void channelUp(){
		++channel;
	}
	void channelDown(){
		--channel;
	}
}

class SmartTv06 extends Tv06{
	
	String text; 
	void caption(){
		
	}
}


public class PolymorphismEX01 {
	public static void main(String[]args){
		//Polymorphism 다형성 
		//여러 가지 형태를 가질 수 있는 능략 
		//조상 타입 참조 변수로 자손 타입 객체를 다루는 것 
		//자손 타입의 참조 변수로 조상 타입의 객체를 가리킬 수 없다 
	
		SmartTv06 s = new SmartTv06(); 
		//SmartTv06 s1 = new Tv(); Error
		Tv06 t = new SmartTv06();
	
	}
}
