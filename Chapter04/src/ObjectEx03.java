class Time{
	
	int hour;
	int minute; 
	int second; 
	
}

public class ObjectEx03 {
	public static void main(String[]args){
		//클래스의 정의 
		//클래스 == 데이터 + 함수 
		//사용자 정의 타입 
		Time t1 = new Time();
		Time t2 = new Time();
		Time t3 = new Time();
		Time[] tArr = new Time[3]; 
		
		t1.hour = 12; 
		t1.minute = 22; 
		t1.second = 60;
		
		System.out.println(t1.hour+"시"+t1.minute+"분"+t1.second +"초");
	}
}
