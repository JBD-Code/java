import java.util.Calendar;

public class CalendarEx04 {
	public static void main(String[]args){
		
		final String[] DAY_OF_WEEK= {"", "��", "��", "ȭ","��","��","��", "��"};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(2019, 3, 29);
		System.out.println("date1�� " +toString(date1)+DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]+ "�����̰�,");
		System.out.println("date2�� " +toString(date2)+DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]+ "�����Դϴ�");
	
		
		long difference = (date2.getTimeInMillis() -date1.getTimeInMillis())/1000;
		System.out.println("date1����  date2���� "+ difference + "�ʰ� �������ϴ�");
		System.out.println("��(day)�� ����ϸ�  "+difference/(24*60*60)+"�� �Դϴ�");
	}

	private static String toString(Calendar date) {
		// TODO Auto-generated method stub
		return date.get(Calendar.YEAR)+"�� "+(date.get(Calendar.MONTH)+1)+"�� "+date.get(Calendar.DATE)+"�� ";
	}
}