import java.util.Arrays;
import java.util.Comparator;

public class CollectionsEx10 {
	public static void main(String []args){
		//Comparator 와 Comparable 
		//객체 정렬에 필요한 메서드를 정의한 인터페이스 
		//comparable 기본 정렬기준을 구현하는데 사용 
		//comparator 기본 저렬 기준 외에 다른 기준으로 정렬하고 할 때 사용 
		//compare()와 compareTo()는 두 객체의 비교 결과를 반환하도록 작성 
		
		String [] strArr = {"cat", "Dog", "lion", "tiger"};
		Arrays.sort(strArr);//String Comparable 구현에 의한 정렬  
		System.out.println("strArr="+Arrays.toString(strArr));
	
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);//comparator 
		System.out.println("strArr="+Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending());//역순 정렬 
		System.out.println("strArr="+Arrays.toString(strArr));
	}
}

class Descending implements Comparator{
	public int compare(Object o1, Object o2){
		if(o1 instanceof Comparable && o2 instanceof Comparable){
			Comparable c1 =(Comparable) o1; 
			Comparable c2 =(Comparable) o2; 
			return c1.compareTo(c2) * -1;
		}
		return -1; 
	}
}	
