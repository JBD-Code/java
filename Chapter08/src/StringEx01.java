
public class StringEx01 {
	public static void main(String[]args){
		//join()�� StringJoiner 
		//join()�� ���� ���ڿ� ���̿� �����ڸ� �־ �����Ѵ� 
		String animals = "dog,cat,bear";
		String []arr = animals.split(",");
		String str = String.join("-", arr);
		System.out.println(str);
		
		//���ڸ� ���ڿ��� �ٲٴ� ��� 
		int i =100; 
		String str1 = i+""; 
		String str2 = String.valueOf(i);

		//���ڿ��� ���ڷ� �ٲٴ� ��� 
		//�⺻�� 
		//byte b   = Byte.parseByte(String s)
		//short s  = Short.parseInt(String s)
		//long l   = Long.parseLong(String s)
		//float f  = Float.parseFloat(String s)
		//double d = Double.parseDouble(String s) 
		//int i = Integer.parseInt(String s) 
		
		//������
		//byte b = Byte.vaueOf(String s)
		//short s  = Short.vaueOf(String s)
		//long l   = Long.vaueOf(String s)
		//float f  = Float.vaueOf(String s)
		//double d = Double.vaueOf(String s) 
		
		int i1 = Integer.parseInt("100");
		byte b = Byte.valueOf("100");
		System.out.println(b);
	}
}
