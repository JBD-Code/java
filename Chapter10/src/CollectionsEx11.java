import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionsEx11 {
	public static void main(String[]args){
		//HashSet - 중복 X 순서 X 
		//Set인터페이스를 구현한 대표적인 컬렉션 클래스 
		//순서를 유지하려면 LinkedHashSet클래스를 사용하면 된다 
		//HashSet() 
		//HashSet(Collection c) 생성자  
		//HashSet(int initialCapacity) 초기 용량 
		//HashSet(int initialCapacity, float loadFactor) //언제 용량을 늘린 것인지를 설정 
		
		//boolean add(Object o) 추가 
		//boolean addAll(Collection c)
		//boolean remove(Object o) 삭제 
		//boolean removeAll(Collection c)
		//boolean retainAll(Collection c) 조건부 삭제 
		//void clear() 모두 삭제 
		
		//boolean contain(Object o) 포함 
		//boolean containAll(Collection c) 여러 객체의 모두 포함  
		//Iterator iterator() 
		
		//TreeSet 
		//범위 검색과 정렬에 유리한 컬렉션 클래스 
		//HashSet보다 데이터 추가 삭제에 시간이 더 걸린다 
		
		Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4","4","4","4"};
		Set set = new HashSet();
		
		for(int i=0; i<objArr.length; i++){
			set.add(objArr[i]);
		}
		System.out.println(set);
		System.out.println();
		Iterator it = set.iterator(); 
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
	}
}
