import java.util.Calendar;

public class CalendarEx08 {
	public static void main(String []args){
		//Calendar Ŭ���� 
		//add()�� Ư�� �ʵ� ���� ���� �Ǵ� ����(�ٸ� �ʵ忡 ������ �ش�) 
		
		Calendar date = Calendar.getInstance(); 
		date.clear();
		date.set(2020, 9, 19);
		
		System.out.println(toString(date));
		System.out.println("1�� �� (add)");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));
		System.out.println("8�� �� (add)");
		date.add(Calendar.MONTH, -8);
		System.out.println(toString(date));

		//roll()�� Ư�� �ʵ��� ���� ���� �Ǵ� ���� (�ٸ� �ʵ忡 ������ ���� �ʴ´�)	

		System.out.println("31�� �� (roll)");
		date.roll(Calendar.DATE, 31);
		System.out.println(toString(date));

		System.out.println("8�� �� (roll)");
		date.roll(Calendar.MONTH, -8);
		System.out.println(toString(date));
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"�� " + date.get(Calendar.MONTH) + "�� " + date.get(Calendar.DATE) + "��";
	}
}
