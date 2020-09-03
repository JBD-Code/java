class Time{
	
	private int hour; 
	private int minute; 
	private int second;
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		
		if(isValidHour(hour)) {
			return;
		}
		this.hour = hour;
	}
	
	private boolean isValidHour(int hour){
		
		return hour < 0 || hour > 23; 
	}
	
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	} 
	
}

public class AccessModifierEx04{
	public static void main(String[]args){
		//Access Modifier Encapsulation
		//���������ڸ� ����ϴ� ������ �ܺη� ���� �����͸� ��ȣ�ϱ� ���ؼ��̴�

		Time t = new Time(); 
		t.setHour(21);
		System.out.println(t.getHour());
		t.setHour(100);
		System.out.println(t.getHour());
	}
}
