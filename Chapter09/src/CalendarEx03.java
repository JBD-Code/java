import java.util.Calendar;

public class CalendarEx03 {
	public static void main(String[]args){
		//Calendar 클래스 
		//set()으로 날짜 지정하가 
		//void set(int field, int value)
		//void set(int field, int month, int date)
		//void set(int field, int month, int date, int hourOfDay, int minute)
		//void set(int field, int month, int date, int hourOfDay, int minute, int second)
		
		//날짜를 지정하는 방법
		//월(MONTH)이 0부터 시작한다는 것을 주의 
		Calendar date1 = Calendar.getInstance();
		date1.set(2021, 0, 1);
		//date1.set(Calendar.YEAR, 2021);
		//date1.set(Calendar.MONTH, 1);
		//date1.set(Calendar.DATE, 1);
		
		
		//시간 지정하는 방법 
		Calendar time1 = Calendar.getInstance();
		time1.set(Calendar.HOUR, 10);
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);
	
	}
}
