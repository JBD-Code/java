import java.io.IOException;
import java.sql.SQLException;

class Parent{
	void parentMethod() throws IOException, SQLException {
	 	
	}
}
class Child extends Parent{
	void parentMethod() throws IOException { //overloading 
		
	}
	void parentMethod(int i) { //overriding 
		
	}
	void childMethod() { //a 정의
		
	}
	void childMethod(int i) { //overloading 
		
	}	
	
}

public class InheritanceEx05 {
	public static void main(String[]args){
		//Overriding의 조건 
		  
		//선언부가 조상 클래스의 메서드와 일치해야 한다 
		//접근제어자가 조상 클래스의 메서드 보다 좁은 범위로 변경이 불가능 하다 
		//예외는 조상 클래스의 메서드 보다 많이 선언 할 수 없다 
	}
}
