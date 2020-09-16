
public class WrapperEx01 {
	public static void main(String[]args){
		//Wrapper 
		//8개의 기본형을 객체로 다뤄야 할 때 사용하는 클래스 
		//boolean - Boolean 
		//char 	  - Character 
		//byte 	  - Byte	
		//int 	  - Integer 
		//long 	  - Long
		//float   - Float 
		//double  - Double 
		
		Integer i1  = new Integer(100);
		Integer i2 = new Integer(100);
		System.out.println("i1==i2? " + (i1==i2));
		System.out.println("i1.equals(i2)? " + i1.equals(i2));
		System.out.println("i1.compareTo(i2)= " + i1.compareTo(i2));
		System.out.println("i1.toString()= " + i1.toString());
		
		System.out.println("MAX_VALUE = "+Integer.MAX_VALUE);
		System.out.println("MIN_VALUE = "+Integer.MIN_VALUE);
		System.out.println("SIZE = "+Integer.SIZE+" bits");
		System.out.println("BYTES = "+Integer.BYTES+" bytes");
		System.out.println("TYPE = "+Integer.TYPE);
	}
}
