class Time{
	
	int hour;
	int minute; 
	int second; 
	
}

public class ObjectEx03 {
	public static void main(String[]args){
		//Ŭ������ ���� 
		//Ŭ���� == ������ + �Լ� 
		//����� ���� Ÿ�� 
		Time t1 = new Time();
		Time t2 = new Time();
		Time t3 = new Time();
		Time[] tArr = new Time[3]; 
		
		t1.hour = 12; 
		t1.minute = 22; 
		t1.second = 60;
		
		System.out.println(t1.hour+"��"+t1.minute+"��"+t1.second +"��");
	}
}
