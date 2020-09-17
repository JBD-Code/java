import java.util.Calendar;

public class CalendarEx01 {
	public static void main(String[]args){
		//java.util.Date
		//��¥�� �ð��� �ٷ� �������� �յ���� Ŭ����(JDK1.0)
		//Date�� �޼���� ���� deprecated �Ǿ�����, ������ ���̰� �ִ� 
		
		//java.util.Calendar 
		//DateŬ������ ������ ���ο� Ŭ����(JDK1.1) ������ ������ ���� 
		
		//java.timepackage
		//Date�� Calendar�� ������ ������ ���ο� Ŭ�������� ����(JDK1.8)
		
		//Calendar Ŭ���� 
		//�߻� Ŭ�����̹Ƿ� getInstance()�� ���� ��ü�� ���� �Ѵ� 
		
		//Canendar cal = new Calendar(); //Error 
		Calendar cal = Calendar.getInstance();
		//get()���� ��¥�� �ð� �ʵ� �������� - int get(int field) 
		int thisYear = cal.get(Calendar.YEAR);
		int thisMonth  = cal.get(Calendar.MONTH)+1;
		int lastDayOfMonth = cal.getActualMaximum(Calendar.DATE); //�� ���� �������� 
		System.out.println(thisYear + "year" +thisMonth + "Month");
		
		//Calendar�� ���ǵ� �ʵ� 
		//��¥ 
		//YEAR 					��	 
		//MONTH					�� (0���� ����)
		//WEEK_OF_YEAR			1�� 1�Ϻ��� ~���� 
		//WEEK_OF_MONTH			�� ���� ���° ��
		//DATE					�� 
		//DAY_OF_MONTH			�� ���� ���° ��
		//DAY_OF_YEAR			�� ���� ���° �� 
		//DAY_OF_WEEK			���� 
		//DAY_OF_WEEK_IN_MONTH  �� ���� ���° ���� 
		
		//�ð� 
		//HOUR					�ð�(0~11)
		//HOUR_OF_DAY			�ð�(0~23)
		//MINUTE				��
		//SECOND				��
		//MILLISECOND			õ���� ���� 
		//ZONE_OFFSET			GMT ���� ���� 
		//AM_PM					��õ/����
		
	}
}
