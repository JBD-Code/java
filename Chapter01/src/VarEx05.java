
public class VarEx05 {
	public static void main(String[]args){
	//Java ����� Counter 
		
		short sMin = -32768, sMax =32767; 
		/*
		2byte  = 16bit = 2�� 16����  = 65536
		short ��ȣ �ִ� ����  short�� ���� -327 68 ~ 32767
		char  ��ȣ ���� ���� char�� ���� 0~65535
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
		
		//10���� ���ڸ� (0~9)  0 ~ 10-1   
		//10���� ���ڸ� (00~99) 0 ~ 10��-1   
		//10���� ���ڸ� (000~999) 0 ~ 10��-1   
		//10���� ���ڸ� (0000~9999) 0 ~ 10��-1   
		
		String str = "3"; 
		System.out.println('3'-'0');
		System.out.println('3'+1);
		System.out.println("3"+"1");
		System.out.println((char)(3+'0'));
		
		// 
		
		
	
	 }
}
