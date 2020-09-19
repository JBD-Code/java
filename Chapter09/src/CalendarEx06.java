import java.util.Calendar;
import java.util.Date;

public class CalendarEx06 {
	public static void main(String[]args){
		//Calendar 클래스 
		//clear()는 Calendar 객체의 모든 필드를 초기화 시킨다 
		Calendar dt = Calendar.getInstance();
		System.out.println(new Date(dt.getTimeInMillis()));
		
		dt.clear();
		System.out.println(new Date(dt.getTimeInMillis()));
		//clear(int field)는 Calendar 객체의 특정 필드를 초기화 
		Calendar dt2 = Calendar.getInstance();
		System.out.println(new Date(dt2.getTimeInMillis()));
		
		dt.clear(Calendar.SECOND); 			//초를 초기화 
		dt.clear(Calendar.MINUTE); 			//분을 초기화 
		dt.clear(Calendar.HOUR_OF_DAY);     //시간을 초기화
		dt.clear(Calendar.HOUR);			//시간을 초기화 
	}
}
