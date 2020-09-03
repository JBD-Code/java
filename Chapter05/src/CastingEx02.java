class Car01 {
	String color; 
	int door; 
	
	void drive(){
		System.out.println("drive");
	}
	void stop(){
		System.out.println("stop");
	}
}

class FireEngine01 extends Car01{
	void water(){
		System.out.println("water");
	}
	
}
class Ambluance01 extends Car01{
	void call(){
		System.out.println("call");
	}
}
public class CastingEx02 {
	public static void main(String[]args){
		//instanceof 연산자
		//형변환 전에 반드시 instanceof 연산자를 이용하여 확인해야 한다 
		Car01 c = new Car01();
		FireEngine01 f = new FireEngine01();
		Ambluance01 a = new Ambluance01();
		
		if(f instanceof FireEngine01){
			System.out.println("This is a FireEngine01 instance");
		}
		
		if(f instanceof Car01){
			System.out.println("This is a Car01 instance");
		}
		if(f instanceof Object){
			System.out.println("This is a Object instance");
		}
		
		if(c instanceof FireEngine01){
			System.out.println("This is a FireEngine01 instance");
		}
		
		if(c instanceof Car01){
			System.out.println("This is a Car01 instance");
		}
		if(c instanceof Object){
			System.out.println("This is a Object instance");
		}
		
		if(a instanceof Ambluance01){
			System.out.println("This is a Ambluance01 instance");
		}
		if(a instanceof Car01){
			System.out.println("This is a Car01 instance");
		}
		if(a instanceof Object){
			System.out.println("This is a Object instance");
		}
		
		System.out.println(f.getClass().getName());
		System.out.println(c.getClass().getName());
		System.out.println(a.getClass().getName());
	}
}
