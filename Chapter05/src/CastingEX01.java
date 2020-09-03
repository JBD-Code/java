class Car {
	String color; 
	int door; 
	
	void drive(){
		System.out.println("drive ");
	}
	void stop(){
		System.out.println("stop");
	}
}

class FireEngine extends Car{
	
	void water(){
		System.out.println("water");
	}
	
}
class Ambulance extends Car{
	
}


public class CastingEX01 {
	public static void main(String[]args){
		//참조변수의 형변환
		//사용할 수 있는 멤버의 개수를 조절하는 것 
		//조상 자손 관계의 참조변수는 서로 형 변환 가능 
	
	
		FireEngine f = new FireEngine();
		f.color = "Red";
		Car c = f;
		FireEngine f2 = (FireEngine)c;
		f2.drive();
		f2.water();
	}
}
