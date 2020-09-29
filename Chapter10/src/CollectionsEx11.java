import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionsEx11 {
	public static void main(String[]args){
		//HashSet - �ߺ� X ���� X 
		//Set�������̽��� ������ ��ǥ���� �÷��� Ŭ���� 
		//������ �����Ϸ��� LinkedHashSetŬ������ ����ϸ� �ȴ� 
		//HashSet() 
		//HashSet(Collection c) ������  
		//HashSet(int initialCapacity) �ʱ� �뷮 
		//HashSet(int initialCapacity, float loadFactor) //���� �뷮�� �ø� �������� ���� 
		
		//boolean add(Object o) �߰� 
		//boolean addAll(Collection c)
		//boolean remove(Object o) ���� 
		//boolean removeAll(Collection c)
		//boolean retainAll(Collection c) ���Ǻ� ���� 
		//void clear() ��� ���� 
		
		//boolean contain(Object o) ���� 
		//boolean containAll(Collection c) ���� ��ü�� ��� ����  
		//Iterator iterator() 
		
		//TreeSet 
		//���� �˻��� ���Ŀ� ������ �÷��� Ŭ���� 
		//HashSet���� ������ �߰� ������ �ð��� �� �ɸ��� 
		
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
