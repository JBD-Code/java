import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx01 {
	public static void main(String[]args) throws ParseException{
		//SimpleDateFormat
		//날짜와 시간을 다양한 형식을 출력할 수 있게 해준다 
		//숫자를 문자열 (format) 문자를 숫자(parse) 
		Date today = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String result = df.format(today);
		System.out.println(result);
		
		DateFormat df2 = new SimpleDateFormat("yyyy년 MM월 dd일");
		DateFormat df3 = new SimpleDateFormat("yyyy MM dd");
		
		Date d = df2.parse("2020년 9월 22일");
		String result2 = df3.format(d);
		System.out.println(result2);
	}
}
