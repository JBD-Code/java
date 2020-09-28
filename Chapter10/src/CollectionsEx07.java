import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsEx07 {
	public static void main(String[]args){
		//Iterator, ListIterator, Enumeration
		//컬렉션에 저장된 데이터를 접근하는데 사용되는 인터페이스 
		//Enumeration은 Iterator의 구버전 
		//ListIterator는 Iterator의 접근성을 향상 시킨 것(단방향 - > 양방향) 
		
		//Iterator 
		//컬렉션에 저장된 요소들을 읽어오는 방법을 표준화하는 것 
		//hasNext() 읽어올 요소가 있는지 확인 한다. 있으면 true 없음녀 false  
		//Object next() 다음 요소를 읽어 온다. next()를 호출하기 위해 hasNext()를 이용하여 
		//읽어올 요소가 있는지를 확인하는 것이 안전하다 
		//컬렉션에서 iterator()를 호출해서 Iterator를 구현한 객체를 얻어서 사용한다 
		
		ArrayList list = new ArrayList();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator(); 
		
		while(it.hasNext()){
			Object obj = it.next(); 
			System.out.println(obj);
		}
		
		//iterator는 1회용이기 때문에 다 쓰고 나면 다시 얻어와야 한다 
		Iterator it2 = list.iterator(); 
		
		for(int i=0; i<list.size(); i++){
			Object obj= it2.next();
			System.out.println(obj);
		}
		
		//Map과 Iterator 
		//Map에는 iterator 이 없으므로 keySet, entrySet, values()를 호출해서 사용 

	}
}
