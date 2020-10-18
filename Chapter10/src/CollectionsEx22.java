import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionsEx22 {
	public static void main(String[]args){
		HashMap  map = new HashMap();
		map.put("kim1", new Integer(90));
		map.put("kim2", 65);
		map.put("kim3", 75);
		map.put("kim4", 88);
		map.put("kim5", 80);
		map.put("kim6", 100);
		
		Set set = map.entrySet(); 
		Iterator it = set.iterator(); 
		
		while(it.hasNext()){
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("�̸� : " + e.getKey() + " ���� : " + e.getValue());
		}
		
		set = map.keySet();
		System.out.println("������ ���" + set);
	
		Collection values = map.values();
		it = values.iterator(); 
		
		int total = 0; 
		
		while(it.hasNext()){
			int i = (int)it.next();
			total +=i;
		}
		
		System.out.println("���� : " + total);
		System.out.println("��� : " + (float)total/set.size());
		System.out.println("�ְ����� : " + Collections.max(values));
		System.out.println("�������� : " + Collections.min(values));
		
	
	}
}
