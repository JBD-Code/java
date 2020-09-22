import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx01 {
	public static void main(String[]args) throws ParseException{
		//SimpleDateFormat
		//��¥�� �ð��� �پ��� ������ ����� �� �ְ� ���ش� 
		//���ڸ� ���ڿ� (format) ���ڸ� ����(parse) 
		Date today = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String result = df.format(today);
		System.out.println(result);
		
		DateFormat df2 = new SimpleDateFormat("yyyy�� MM�� dd��");
		DateFormat df3 = new SimpleDateFormat("yyyy MM dd");
		
		Date d = df2.parse("2020�� 9�� 22��");
		String result2 = df3.format(d);
		System.out.println(result2);
	}
}
