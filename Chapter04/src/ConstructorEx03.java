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
		//������ this() 
		//�����ڿ��� �ٸ� ������ ȣ���� �� ��� 
		//�ٸ� ������ ȣ�� �� ù �ٿ����� ��밡�� 
		Car02 c = new Car02();
		
		//�������� this
		//instance �ڽ��� ����Ű�� �������� 
		//instance method���� ����� ���� 
		//local variable �� instance variable ���� �� �� ���
	}
}
