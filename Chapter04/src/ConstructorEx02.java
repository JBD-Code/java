class Car{
	String color ; 
	String gearType; 
	int door; 
	
	Car(){}
	Car(String a, String b, int c){
		
		color = a; 
		gearType =b; 
		door =c; 
	}
}

class Data_1 {
	int value; 
}
class Data_2 {
	
	int value ; 
	
	Data_2(){}
	Data_2(int x){
		value = x; 
	}
}

public class ConstructorEx02 {
	public static void main(String[]args){
		
		Data_1 d1 = new Data_1(); 
		Data_2 d2 = new Data_2();
		
		Car c = new Car("White", "Aute", 4);
		System.out.println(c.color);
		System.out.println(c.gearType);
		System.out.println(c.door);
	}
}
