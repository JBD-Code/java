import java.util.ArrayList;

public class GenericsEx01 {
	public static void main(String[]args){
		//Generics? 
		//컴파일시 타입을 체크해 주는 기능 (compile-time type check) JDK1.5
		/*
		ArrayList list = new ArrayList();//JDK1.5 이전 Generic 도입 이전 
		list.add(10);
		list.add(20);
		list.add(30);
		list.add("30"); //String을 추가 
		
		Integer i= (Integer)list.get(3); 
		//compile 가능하지만 ClassCastException compile의 한계 
		//실행시 에러 < 컴파일에러 
		//실행시 발생하는 에러를 컴파일할 때 파악하기 위한 것으로 Generic가 등
		System.out.println(i);
		System.out.println(list);
		 */
		
		//ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(10);		
		list.add(20);		
		list.add(30);		
		list.add("30"); 
		Integer i = (Integer)list.get(3);
		String str = (String)list.get(3);
		System.out.println(list);
		
		//객체의 타입 안정성을 제공한다  
		//타입체크의 형변환을 생략할 수 있으므로 코드가  간결해진다 
		
		
	}
}
