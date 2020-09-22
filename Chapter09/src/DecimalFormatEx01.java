import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormatEx01 {
	public static void main(String[]args) throws ParseException{
		//형식화 클래스 
		//java.text 패키지의DecimalFormat, SimpleDateFormat 
		//숫자와 날짜를 원하는 형식으로 쉽게 출력이 가능 (숫자, 날짜-> 형식 문자열)
		//DecimalFormat 
		//숫자를 형식화 할 때 사용 (숫자 - > 문자열) 
		
		double number =123456.89;
		DecimalFormat df = new DecimalFormat("#.#E0");
		String result = df.format(number);
		System.out.println(result);
	
	
		//형식 문자열에서 숫자와 날짜를 뽑아내는 것도 가능 (형식 문자열 -> 숫자, 날짜)
		//특정 형식의 문자열을 숫자로 변환할 때 사용(형식 문자열 - > 숫자) 
		
		DecimalFormat df2 = new DecimalFormat("#,###.##");
		Number number2 = df2.parse("1,234,567.89");
		double d = number2.doubleValue();
		System.out.println(d);
	
	}
}
