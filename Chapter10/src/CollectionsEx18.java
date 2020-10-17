import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsEx18 {
	public static void main(String[]args){
		//TreeSet
		
		Set set = new TreeSet();
		
		set.add(new Test()); 
		set.add(new Test()); 
		set.add(new Test()); 
		set.add(new Test()); 
		System.out.println(set);
		
	}
}

class Test implements Comparable{

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return -1;
	}
	
}

class TestComp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 1;
	}
	
}