import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsEx07 {
	public static void main(String[]args){
		//Iterator, ListIterator, Enumeration
		//�÷��ǿ� ����� �����͸� �����ϴµ� ���Ǵ� �������̽� 
		//Enumeration�� Iterator�� ������ 
		//ListIterator�� Iterator�� ���ټ��� ��� ��Ų ��(�ܹ��� - > �����) 
		
		//Iterator 
		//�÷��ǿ� ����� ��ҵ��� �о���� ����� ǥ��ȭ�ϴ� �� 
		//hasNext() �о�� ��Ұ� �ִ��� Ȯ�� �Ѵ�. ������ true ������ false  
		//Object next() ���� ��Ҹ� �о� �´�. next()�� ȣ���ϱ� ���� hasNext()�� �̿��Ͽ� 
		//�о�� ��Ұ� �ִ����� Ȯ���ϴ� ���� �����ϴ� 
		//�÷��ǿ��� iterator()�� ȣ���ؼ� Iterator�� ������ ��ü�� �� ����Ѵ� 
		
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
		
		//iterator�� 1ȸ���̱� ������ �� ���� ���� �ٽ� ���;� �Ѵ� 
		Iterator it2 = list.iterator(); 
		
		for(int i=0; i<list.size(); i++){
			Object obj= it2.next();
			System.out.println(obj);
		}
		
		//Map�� Iterator 
		//Map���� iterator �� �����Ƿ� keySet, entrySet, values()�� ȣ���ؼ� ��� 

	}
}
