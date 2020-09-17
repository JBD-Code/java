import java.util.Calendar;

public class CalendarEx01 {
	public static void main(String[]args){
		//java.util.Date
		//날짜와 시간을 다룰 목적으로 먼들어진 클래스(JDK1.0)
		//Date의 메서드는 거의 deprecated 되었지만, 여전히 쓰이고 있다 
		
		//java.util.Calendar 
		//Date클래스를 개서한 새로운 클래스(JDK1.1) 여전히 단점이 존재 
		
		//java.timepackage
		//Date와 Calendar의 단점을 개선한 새로운 클래스들을 제공(JDK1.8)
		
		//Calendar 클래스 
		//추상 클래스이므로 getInstance()를 통해 객체를 얻어야 한다 
		
		//Canendar cal = new Calendar(); //Error 
		Calendar cal = Calendar.getInstance();
		//get()으로 날짜와 시간 필드 가져오기 - int get(int field) 
		int thisYear = cal.get(Calendar.YEAR);
		int thisMonth  = cal.get(Calendar.MONTH)+1;
		int lastDayOfMonth = cal.getActualMaximum(Calendar.DATE); //이 달의 마지막날 
		System.out.println(thisYear + "year" +thisMonth + "Month");
		
		//Calendar에 정의된 필드 
		//날짜 
		//YEAR 					년	 
		//MONTH					월 (0부터 시작)
		//WEEK_OF_YEAR			1월 1일부터 ~지금 
		//WEEK_OF_MONTH			그 달의 몇번째 주
		//DATE					일 
		//DAY_OF_MONTH			그 달의 몇번째 일
		//DAY_OF_YEAR			그 해의 몇번째 일 
		//DAY_OF_WEEK			요일 
		//DAY_OF_WEEK_IN_MONTH  그 달의 몇번째 요일 
		
		//시간 
		//HOUR					시간(0~11)
		//HOUR_OF_DAY			시간(0~23)
		//MINUTE				분
		//SECOND				초
		//MILLISECOND			천분의 일초 
		//ZONE_OFFSET			GMT 기준 시차 
		//AM_PM					오천/오후
		
	}
}
