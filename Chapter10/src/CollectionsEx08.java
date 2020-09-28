import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsEx08 {
	public static void main(String[]args){
		//Arrays �迭�� �ٷ�� ���� �޼���(static)�� ���� 
		//1. �迭�� ��� toString() 
		//2. �迭�� ����  copyOf(), copyOfRange() 
		
		int []arr = {0, 1,2,3,4,5};
		int []arr2 = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(arr2));
		//3. �迭 ä��� fill(), setAll() 
		
		int[]arr3 = new int[5]; 
		Arrays.fill(arr3, 9);
		System.out.println(Arrays.toString(arr3));
		Arrays.setAll(arr3, (i) -> (int)(Math.random()*5)+1);
		
		//4. ���İ� �˻� - sort(), binarySearch() 
		int[] arr4 = {3, 2, 0 , 1, 4};
		int idx = Arrays.binarySearch(arr4, 2);
		System.out.println(idx); // �߸��� ��� -5 
		//binarySearch()�� �迭�� ������ �Ŀ� �ؾ����� �ùٸ� ����� Ȯ���� �� �ִ� 
		
		
		Arrays.sort(arr4);
		System.out.println(Arrays.toString(arr4));
		int idx2 = Arrays.binarySearch(arr, 2);
		System.out.println(idx2);
		
		//5. ������ �迭�� ��� deepToString() 
		int[] arr5 = {0, 1, 2, 3, 4,5};
		int[][] arr2D = {{10, 11, 12}, {13, 14, 15}};
		
		System.out.println(Arrays.toString(arr5));
		System.out.println(Arrays.deepToString(arr2D));
		
		//6. ������ �迭�� �� deepEquals() 
		String[][]str2D = new String[][]{{"aaa", "bbb"}, {"AAA","BBB"}};
		String[][]str2D2 = new String[][]{{"aaa", "bbb"}, {"AAA","BBB"}};
		
		System.out.println();
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		System.out.println(Arrays.equals(str2D, str2D2));
		
		//7. �迭�� List�� ��ȯ asList(Object...a) 
		List list = Arrays.asList(new Integer[]{1,2,3,4,5});//�б� ���� ����Ұ�
		List list2 = Arrays.asList(1,2,3,4,5); // �б� ���� ���� �Ұ�  
		
		List list3 = new ArrayList(Arrays.asList(1,2,3,4,5));
		
	
	}
}
