import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormatEx01 {
	public static void main(String[]args) throws ParseException{
		//����ȭ Ŭ���� 
		//java.text ��Ű����DecimalFormat, SimpleDateFormat 
		//���ڿ� ��¥�� ���ϴ� �������� ���� ����� ���� (����, ��¥-> ���� ���ڿ�)
		//DecimalFormat 
		//���ڸ� ����ȭ �� �� ��� (���� - > ���ڿ�) 
		
		double number =123456.89;
		DecimalFormat df = new DecimalFormat("#.#E0");
		String result = df.format(number);
		System.out.println(result);
	
	
		//���� ���ڿ����� ���ڿ� ��¥�� �̾Ƴ��� �͵� ���� (���� ���ڿ� -> ����, ��¥)
		//Ư�� ������ ���ڿ��� ���ڷ� ��ȯ�� �� ���(���� ���ڿ� - > ����) 
		
		DecimalFormat df2 = new DecimalFormat("#,###.##");
		Number number2 = df2.parse("1,234,567.89");
		double d = number2.doubleValue();
		System.out.println(d);
	
	}
}
