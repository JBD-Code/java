import java.util.Calendar;

public class CalendarEx08 {
	public static void main(String []args){
		//Calendar 클래스 
		//add()는 특정 필드 값을 증가 또는 감소(다른 필드에 영향을 준다) 
		
		Calendar date = Calendar.getInstance(); 
		date.clear();
		date.set(2020, 9, 19);
		
		System.out.println(toString(date));
		System.out.println("1일 후 (add)");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));
		System.out.println("8달 전 (add)");
		date.add(Calendar.MONTH, -8);
		System.out.println(toString(date));

		//roll()은 특정 필드의 값을 증가 또는 감소 (다른 필드에 영향을 주지 않는다)	

		System.out.println("31일 후 (roll)");
		date.roll(Calendar.DATE, 31);
		System.out.println(toString(date));

		System.out.println("8달 전 (roll)");
		date.roll(Calendar.MONTH, -8);
		System.out.println(toString(date));
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년 " + date.get(Calendar.MONTH) + "월 " + date.get(Calendar.DATE) + "일";
	}
}
