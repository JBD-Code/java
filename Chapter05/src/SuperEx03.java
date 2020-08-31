class Parent08{
	
	int x, y ; 
	
	Parent08(int x, int y){
		this.x=x;
		this.y=y;
	}
	String getLocation() {
		return "x : " +x + ", y : " +y;
	}
}

class Child08 extends Parent08{
	
	int z;  
	
	Child08(int x, int y, int z){
		super(x,y);
		//this.x=x; 
		//this.y=y; 
		this.z=z; 
	}
	String getLocation() {
		return "x : " +x + ", y : " +y + ", z :" +z;
	}
	
}

public class SuperEx03 {
	public static void main(String[]args){
		//super() 조상의 생성자 
		//조상의 생성자를 호출할 때 사용 
		//조상의 멤버는 조상의 생성자를 호출해서 사용 
		//생성자의 첫줄에는 반드시 생성자를 호출해야 한다 
		//그렇지 않음냐 컴파일러가 생성자의 첫줄에 super()을 삽입  
		Child08 c = new Child08(4, 5, 6); 
		System.out.println(c.getLocation());
	}
}
