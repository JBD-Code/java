import java.util.Arrays;
import java.util.Comparator;

public class CollectionsEx10 {
	public static void main(String []args){
		//Comparator �� Comparable 
		//��ü ���Ŀ� �ʿ��� �޼��带 ������ �������̽� 
		//comparable �⺻ ���ı����� �����ϴµ� ��� 
		//comparator �⺻ ���� ���� �ܿ� �ٸ� �������� �����ϰ� �� �� ��� 
		//compare()�� compareTo()�� �� ��ü�� �� ����� ��ȯ�ϵ��� �ۼ� 
		
		String [] strArr = {"cat", "Dog", "lion", "tiger"};
		Arrays.sort(strArr);//String Comparable ������ ���� ����  
		System.out.println("strArr="+Arrays.toString(strArr));
	
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);//comparator 
		System.out.println("strArr="+Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending());//���� ���� 
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
