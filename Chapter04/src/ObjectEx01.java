class Tv{
	
	String color; 
	boolean power; 
	int channel;
	
	public void power(){
		power =!power ;
	}
	public void channelUp(){
		++channel; 
		
	}
	public void channelDown(){
		--channel;
	}
	
}

public class ObjectEx01 {
	public static void main(String[]args){
		//객체지향 언어 
		//클래스와 객체 
		//클래스의 정의 - 객체를 정의해 놓은 것 
		//클래스의 용도 - 객체를 생성하는데 사용 
		
		//객체의 정의 실제로 존재하는 것 사물 또는 개념 
		//객체의 용도 객체가 가지고 있는 기능과 속성에 따라 다르다 
		//객체 = 속성(변수) + 기능(메서드) 
		
		
		//객체 : 모든 인스턴스를 대표하는 일반적 용어 
		//인스턴스 : 특정 클래로부터 생성된 객체 
		
		//객체의 생성과 사용 
		//클래스명 변수명 ; 
		//변수명 = new 클래스명() 
				
		//Tv t; 
		//t = new Tv() ;
		Tv t; 
		t = new Tv(); 
		t.channel=7;
		
		t.channelDown();
		System.out.println(t.channel);
	
	}
}
