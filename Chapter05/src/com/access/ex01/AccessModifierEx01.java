package com.access.ex01;
class staticTest{
	
	static int width  =200; 
	static int height =100; 
	
	static {
		
	}
	
	static int max(int a,  int b ){
		return a > b ? a : b ;
	}
}

final class finalTest { //확장될 수 없는 클래스, 조상이 될 수 없는 클래스  
	
	final int MAX_SIZE = 10; //값을 변경할 수 없는 멤버변수(상수)
	
	final void getMaxSize() {	//오버라이딩 할 수 없는 메서드 
		
		final int LV = MAX_SIZE; //값을 변경할 수 없는 변수(상수)
		
	}
	
}

abstract class AbstractTest{ //추상큻래스 추상메서드를 포함한 클래스 
	
	abstract void move(); //추상메서드 구현부가 없는 메서드 
}

public class AccessModifierEx01 {
	public static  void main(String[]args){
		//Modifier 제어자 
		//클래스와 클래스의 멤버(변수, 메서드)에 부가적인 의미를 부여 
		//접근 제어자 public, protected, default, private  
		//하나의 대상에 제어자를 같이 사용가능 하지만, 접근 제어자는 하나만 사용가능 
		//static - 클래스의 공통적인 멤버 변수, 메서드 
		
	}
}
