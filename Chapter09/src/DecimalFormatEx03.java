import java.text.DecimalFormat;

public class DecimalFormatEx03 {
	public static void main(String[]args){
		
		//문자열 - > 숫자 -> 문자열 
		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#,###E0");
		
		try {
			Number num =df.parse("1,234,567.89");
			System.out.print("1,234,567.89" + " -> " );
			
			double d = num.doubleValue();
			System.out.print(d + " -> ");
			
			System.out.print(df2.format(num));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
