import java.util.Calendar;
import java.util.Date;

public class CalendarEx06 {
	public static void main(String[]args){
		//Calendar Ŭ���� 
		//clear()�� Calendar ��ü�� ��� �ʵ带 �ʱ�ȭ ��Ų�� 
		Calendar dt = Calendar.getInstance();
		System.out.println(new Date(dt.getTimeInMillis()));
		
		dt.clear();
		System.out.println(new Date(dt.getTimeInMillis()));
		//clear(int field)�� Calendar ��ü�� Ư�� �ʵ带 �ʱ�ȭ 
		Calendar dt2 = Calendar.getInstance();
		System.out.println(new Date(dt2.getTimeInMillis()));
		
		dt.clear(Calendar.SECOND); 			//�ʸ� �ʱ�ȭ 
		dt.clear(Calendar.MINUTE); 			//���� �ʱ�ȭ 
		dt.clear(Calendar.HOUR_OF_DAY);     //�ð��� �ʱ�ȭ
		dt.clear(Calendar.HOUR);			//�ð��� �ʱ�ȭ 
	}
}
