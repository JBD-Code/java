class Constructor01{

	int hour; 
	int minute; 
	int second;

}
public class ConstructorEx01 {
	public static void main(String[]args){
		//Constructor
		//instance가 생성될 때 마다 호출되는 instance 초기화 method
		//생성자의 이름은 클래스의 이름과 동일해야 한다 
		//return 값이 존재 하지 않는다 
		//모든 클래스는 반드시 생성자를 가진다 
		
		Constructor01 c = new Constructor01(); 

		c.hour=10; 
		c.minute=50; 
		c.second=30;
	}
}
