
public class WrapperEx02 {
	public static void main(String[]args){
		//���ڿ��� ���ڷ� ��ȯ�ϱ� 
		//���ڿ��� ���ڷ� ��ȯ�ϴ� ��� 
		int i = new Integer("100").intValue();
		int i2 = Integer.parseInt("100");
		int i3 = Integer.valueOf("100");
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
		String str = Integer.valueOf("100").toString();
		System.out.println(str.getClass().getName());
		
		//n������ ���ڿ��� ���ڷ� ��ȯ�ϴ� ��� 
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
