class Car02{
	
	String color; 
	String gearType; 
	int door;
	Car02(){
		
		this("White","Auto", 4);
	
	}
	
	Car02(String name) {

		this(name, "Auto", 4);
	
	}
	
	Car02(String color,  String gearType, int door){
		this.color = color; 
		this.gearType = gearType;
		this.door =door;
	}
}

public class ConstructorEx03 {
	public static void main(String[]args){
		//생성자 this() 
		//생성자에서 다른 생성자 호출할 때 사용 
		//다른 생성자 호출 시 첫 줄에서만 사용가능 
		Car02 c = new Car02();
		
		//참조변수 this
		//instance 자신을 가리키는 참조변수 
		//instance method에서 사용이 가능 
		//local variable 와 instance variable 구벌 할 때 사용
	}
}
