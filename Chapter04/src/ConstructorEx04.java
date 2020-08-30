 

class Constructor04{
	
}

class StaticBlockTest{
	static int []arr = new int[10]; //명시적 초기화 
	
	static { //클래스 초기화 블럭 
		for(int i=0; i<arr.length; i++){
			arr[i] = (int)(Math.random()*10)+1;
		}
	}
}


public class ConstructorEx04 {
	public static void main(String[]args){
		//variable의 초기화 
		//local variable는 사용하기전에 반드시 수동 초기화 과정이 필요하다 
		
		//local variable, class variable의 초기화  
		//1. 명시적 초기화 (=)대입 연산자를 사용 (간단 초기화) 
		
		//2. 초기화 불럭 (복잡 초기화) 
		//-인스턴스 초기화 블럭:{} 
		//-클래스 초기화 블럭: static {} 
		
		//3. 생성자 (복잡 초기화)
		
		//멤버변수의 초기화 
		//class variable 의 초기화 시점 : 클래스가 처음 로딩될 때 단 한번 
		//instance variable 의 초기화 시점 : 인스턴스가 생성될 대 마다
	
	}
}
