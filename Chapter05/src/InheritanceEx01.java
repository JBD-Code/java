class Tv{
	boolean power; 
	int channel ;

	void power(){
		power = !power; 
	}
	void channelUp(){
		++channel;
	}
	void channelDown(){
		--channel; 
	}
}

class SmartTv extends Tv {
	boolean caption;
	void displayCaption(String text){
		if(caption){
			System.out.println(text);
		}
	}
}


public class InheritanceEx01 {
	public static void main(String[]args){
		//Inheritance
		//기존의 클래스로 새로운 클래스를 작성하는 것 
		//두 클래스를 부모 자식으로 관계를 맺어주는 것 
		//자손은 조상의 모든 멤버를 상속받는다(생성자, 초기화 블럭 제외) 
		//자손의 멤버 개수는 조상 보다 적을 수 없다(같거나 많다)
		//자손의 변경은 조상에 영향을 미치지 않는다 
		
		SmartTv stv = new SmartTv(); 
		stv.channel=10;
		stv.channelUp();
		System.out.println(stv.channel);
		stv.displayCaption("Hello World");
		stv.caption = true;
		stv.displayCaption("Hello World");
		stv.channelDown();
		System.out.println(stv.channel);
		
		
		
	}
}
