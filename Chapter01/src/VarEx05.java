
public class VarEx05 {
	public static void main(String[]args){
	//Java 계수기 Counter 
		
		short sMin = -32768, sMax =32767; 
		/*
		2byte  = 16bit = 2의 16제곱  = 65536
		short 부호 있는 정수  short의 범위 -327 68 ~ 32767
		char  부호 없는 정수 char의 범위 0~65535
		*/
		char cMin =0, cMax = 65535; 
		System.out.println("sMin = "+ sMin);
		System.out.println("sMin-1 = " + (short)(sMin-1));
		System.out.println("sMax = "+ sMax);
		System.out.println("sMax+1 = "+ (short)(sMax+1));
		System.out.println("cMin =" +(int)cMin);
		System.out.println("cMin-1 = " +(int)--cMin);
		System.out.println("cMax = " +(int)cMax);
		System.out.println("cMin+1 = " +(int)++cMin);
		
		//10진수 한자리 (0~9)  0 ~ 10-1   
		//10진수 두자리 (00~99) 0 ~ 10²-1   
		//10진수 두자리 (000~999) 0 ~ 10³-1   
		//10진수 두자리 (0000~9999) 0 ~ 10⁴-1   
		
		String str = "3"; 
		System.out.println('3'-'0');
		System.out.println('3'+1);
		System.out.println("3"+"1");
		System.out.println((char)(3+'0'));
		
		// 
		
		
	
	 }
}
