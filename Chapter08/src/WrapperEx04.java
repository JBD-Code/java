
public class WrapperEx04 {
	public static void main(String[]args){
		//Autoboxing Unboxing
		int i =10; 
				
		Integer intg = (Integer)i; //Integer intg = Integer.valueOf(i);
		Object obj = (Object)i;	//Object obj = (Object)Integer.valueOf(i);
		
		Long lng = 100L; //Long lng = new Long(100L);
		
		int i2 = intg + 10; //참조형과 기본형간의 연산이 가능 
		long l = intg + lng; //참조형과 참조형간의 덧셈이 가능 
		
		Integer intg2 = new Integer(20);
		int i3 = (int)intg2;//참조형을 기본형으로 형변환 가능(생략가눙)
		
		System.out.println("obj="+obj);
		System.out.println("i2="+i2);
		System.out.println("l="+l);
		System.out.println("intg2="+intg2);
		System.out.println("i3="+i3);
	
	}
	
}
