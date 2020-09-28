import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsEx08 {
	public static void main(String[]args){
		//Arrays 배열을 다루기 편리한 메서드(static)를 제공 
		//1. 배열의 출력 toString() 
		//2. 배열의 복사  copyOf(), copyOfRange() 
		
		int []arr = {0, 1,2,3,4,5};
		int []arr2 = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(arr2));
		//3. 배열 채우기 fill(), setAll() 
		
		int[]arr3 = new int[5]; 
		Arrays.fill(arr3, 9);
		System.out.println(Arrays.toString(arr3));
		Arrays.setAll(arr3, (i) -> (int)(Math.random()*5)+1);
		
		//4. 정렬과 검색 - sort(), binarySearch() 
		int[] arr4 = {3, 2, 0 , 1, 4};
		int idx = Arrays.binarySearch(arr4, 2);
		System.out.println(idx); // 잘못된 결과 -5 
		//binarySearch()는 배열을 정렬한 후에 해야지만 올바른 결과를 확인할 수 있다 
		
		
		Arrays.sort(arr4);
		System.out.println(Arrays.toString(arr4));
		int idx2 = Arrays.binarySearch(arr, 2);
		System.out.println(idx2);
		
		//5. 다차원 배열의 출력 deepToString() 
		int[] arr5 = {0, 1, 2, 3, 4,5};
		int[][] arr2D = {{10, 11, 12}, {13, 14, 15}};
		
		System.out.println(Arrays.toString(arr5));
		System.out.println(Arrays.deepToString(arr2D));
		
		//6. 다차원 배열의 비교 deepEquals() 
		String[][]str2D = new String[][]{{"aaa", "bbb"}, {"AAA","BBB"}};
		String[][]str2D2 = new String[][]{{"aaa", "bbb"}, {"AAA","BBB"}};
		
		System.out.println();
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		System.out.println(Arrays.equals(str2D, str2D2));
		
		//7. 배열을 List로 변환 asList(Object...a) 
		List list = Arrays.asList(new Integer[]{1,2,3,4,5});//읽기 전용 변경불가
		List list2 = Arrays.asList(1,2,3,4,5); // 읽기 전용 변경 불가  
		
		List list3 = new ArrayList(Arrays.asList(1,2,3,4,5));
		
	
	}
}
