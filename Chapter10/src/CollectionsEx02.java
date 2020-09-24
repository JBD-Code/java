import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsEx02 {
	public static void main(String []args){
		//ArrayList 
		//ArrayList는 기존의 Vector를 개선한 것으로 구현 원리와 기능적으로 동일 
		//ArrayList와 달리 Vector는 자체적으로 동기화처리가 되어 있다 
		//List 인터페이스를 구현하므로 저장순서가 유지되고 중복을 허용한다 
		//데이터의 저장공간으로 배열을 사용한다(배열 기반) 
		
		//ArrayList의 메서드 
		
		//생성자 
		//ArrayList() 
		//ArrayList(Collection c) 
		//ArrayList(int initialCapacity) 
		
		//추가 메서드 
		//boolean add(Object o) 
		//void add(int index, Object element) 
		//boolean addAll(Collection c)
		//boolean addAll(int index, Collection c) 
		
		//삭제 
		//boolean remove(Object o)
		//Object remove(int index) 
		//boolean removeAll(Collection c)
		//void clear() 
		
		//검색 
		//int indexOg(Object o) 
		//int lastIndexOf(Object o)
		//boolean contains(Object o) 
		//Object get(int index)
		//Object set(int index, Object element)
		
		//List subList(int fromIndex, intoIndex)
		//Object[] toArray()
		//Object[] toArray(Object[] a)
		//boolean isEmpty() 
		//void trimToSize() 
		//int size() 
		
		ArrayList list1 = new ArrayList(10);
		//ArrayList에는 객체만 저장이 가능 
		//list1.add(5);
		list1.add(new Integer(5));
		list1.add(new Integer(3));
		list1.add(new Integer(2));
		list1.add(new Integer(1));
		list1.add(new Integer(4));
		list1.add(new Integer(0));

		
		ArrayList list2 = new ArrayList(list1.subList(1,4));
		print(list1, list2);
		
		//Collection은 인터페이스 Collections는 유틸클래스
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		System.out.println("list1.containsAll(list2): "+list1.containsAll(list2));
		System.out.println("list1.contains(list2): "+list1.contains(list2));
		
		
		list2.add('A');
		list2.add('C');
		list2.add(4,'B');
		print(list1, list2);
		
		list2.set(2, 'Z');
		print(list1, list2);
		
		list1.add(0, "1");
		print(list1, list2);
		
		System.out.println("index="+list1.indexOf("1"));
		System.out.println("index="+list1.indexOf(1));
		
		list1.remove(0); //index가 1인 객체를 삭제 
		list1.remove(new Integer(1)); //1을 삭제 
		print(list1, list2);
		
		//list1에서 list2와 겹치는 부분을 남기고 나머지는 삭제한다 
		System.out.println("list1.retatinAll(list2): "+list1.retainAll(list2));
		print(list1, list2);
		
		//list2에서 list1에 포함된 객체를 삭제한다 
		for(int i=list2.size()-1; i>=0; i--){
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
		
		
		
		
	}
	
	static void print(ArrayList list1, ArrayList list2){
		System.out.println("list1"+list1);
		System.out.println("list2"+list2);
		System.out.println();
	}
}
