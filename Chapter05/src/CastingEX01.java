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
		//���������� ����ȯ
		//����� �� �ִ� ����� ������ �����ϴ� �� 
		//���� �ڼ� ������ ���������� ���� �� ��ȯ ���� 
	
	
		FireEngine f = new FireEngine();
		f.color = "Red";
		Car c = f;
		FireEngine f2 = (FireEngine)c;
		f2.drive();
		f2.water();
	}
}
