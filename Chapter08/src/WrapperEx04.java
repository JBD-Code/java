
public class WrapperEx04 {
	public static void main(String[]args){
		//Autoboxing Unboxing
		int i =10; 
				
		Integer intg = (Integer)i; //Integer intg = Integer.valueOf(i);
		Object obj = (Object)i;	//Object obj = (Object)Integer.valueOf(i);
		
		Long lng = 100L; //Long lng = new Long(100L);
		
		int i2 = intg + 10; //�������� �⺻������ ������ ���� 
		long l = intg + lng; //�������� ���������� ������ ���� 
		
		Integer intg2 = new Integer(20);
		int i3 = (int)intg2;//�������� �⺻������ ����ȯ ����(��������)
		
		System.out.println("obj="+obj);
		System.out.println("i2="+i2);
		System.out.println("l="+l);
		System.out.println("intg2="+intg2);
		System.out.println("i3="+i3);
	
	}
	
}
