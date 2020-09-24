import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsEx02 {
	public static void main(String []args){
		//ArrayList 
		//ArrayList�� ������ Vector�� ������ ������ ���� ������ ��������� ���� 
		//ArrayList�� �޸� Vector�� ��ü������ ����ȭó���� �Ǿ� �ִ� 
		//List �������̽��� �����ϹǷ� ��������� �����ǰ� �ߺ��� ����Ѵ� 
		//�������� ����������� �迭�� ����Ѵ�(�迭 ���) 
		
		//ArrayList�� �޼��� 
		
		//������ 
		//ArrayList() 
		//ArrayList(Collection c) 
		//ArrayList(int initialCapacity) 
		
		//�߰� �޼��� 
		//boolean add(Object o) 
		//void add(int index, Object element) 
		//boolean addAll(Collection c)
		//boolean addAll(int index, Collection c) 
		
		//���� 
		//boolean remove(Object o)
		//Object remove(int index) 
		//boolean removeAll(Collection c)
		//void clear() 
		
		//�˻� 
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
		//ArrayList���� ��ü�� ������ ���� 
		//list1.add(5);
		list1.add(new Integer(5));
		list1.add(new Integer(3));
		list1.add(new Integer(2));
		list1.add(new Integer(1));
		list1.add(new Integer(4));
		list1.add(new Integer(0));

		
		ArrayList list2 = new ArrayList(list1.subList(1,4));
		print(list1, list2);
		
		//Collection�� �������̽� Collections�� ��ƿŬ����
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
		
		list1.remove(0); //index�� 1�� ��ü�� ���� 
		list1.remove(new Integer(1)); //1�� ���� 
		print(list1, list2);
		
		//list1���� list2�� ��ġ�� �κ��� ����� �������� �����Ѵ� 
		System.out.println("list1.retatinAll(list2): "+list1.retainAll(list2));
		print(list1, list2);
		
		//list2���� list1�� ���Ե� ��ü�� �����Ѵ� 
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
