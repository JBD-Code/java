import java.util.ArrayList;

public class WrapperEx03 {
	public static void main(String[]args){
		//Autoboxing Unboxing
		//기본형 - > 참조형 
		//참조형 - > 기본형 
		
		//JDK1.5 이전에는 기본형과 참조형간의 참조형이 불가능 
		//컴파일 전의 코드
		int i =5;
		Integer iObj = new Integer(7);
		int sum = i+ iObj;
		System.out.println(sum);
		
		
		//컴파일 후의 코드 
		//int i =5;
		//Integer iObj = new Integer(7);
		//int sum = i+ iObj.intValue();
		//System.out.println(sum);
		
		ArrayList<Integer>list =new ArrayList<Integer>();
		list.add(10);//JDK1.5 이전에는 에러 
		//Integer value = list.get(0);		
		//list.add(new Integer(10));
		int value = list.get(0);
		//int value = list.get(0).intValue();
		System.out.println(value);
		
	}
}
