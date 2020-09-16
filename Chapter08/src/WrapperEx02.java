
public class WrapperEx02 {
	public static void main(String[]args){
		//문자열을 숫자로 변환하기 
		//문자열을 숫자로 반환하는 방법 
		int i = new Integer("100").intValue();
		int i2 = Integer.parseInt("100");
		int i3 = Integer.valueOf("100");
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
		String str = Integer.valueOf("100").toString();
		System.out.println(str.getClass().getName());
		
		//n진법의 문자열을 숫자로 변환하는 방법 
		int i4 = Integer.parseUnsignedInt("100", 2);
		int i5 = Integer.parseUnsignedInt("100", 8);
		int i6 = Integer.parseUnsignedInt("100", 16);
		int i7 = Integer.parseUnsignedInt("FF", 16);
	
		System.out.println(i4);
		System.out.println(i5);
		System.out.println(i6);
		System.out.println(i7);
	
	}
}
