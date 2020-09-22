import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx03 {
	public static void main(String[]args){
		
		DateFormat df = new SimpleDateFormat("yyyy년MM월 dd일");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
	
		try{
			Date today = df.parse("2020년 9월 22일");
			System.out.println(df2.format(today));
			System.out.println(df.format(today));
		}catch(Exception e){
			
		}
	}
}
