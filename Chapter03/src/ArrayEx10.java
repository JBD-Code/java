import java.util.Arrays;

public class ArrayEx10 {
	public static void main(String[]args){
		//배열의 비교와 출력 -  equals(), toString() 
		int[] arr = {1,2,3,4,5};
		int[][] arr2D ={{11,22}, {33,44}};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2D));
		
		String[][]str2D = new String[][]{{"111", "222"}, {"333", "444"}}; 
		String[][]str2D2 = new String[][]{{"AAA", "BBB"}, {"CCC", "DDD"}}; 
		
		System.out.println(Arrays.equals(str2D, str2D2));
		System.out.println(Arrays.deepEquals(str2D, str2D2));
	
		//배열의 복사 -	copyOf(), copyOfRange() 
		int[] arr01 = {0,1,3,5,7};
		int[] arr02 = Arrays.copyOf(arr01, arr01.length);
		System.out.println(Arrays.toString(arr02));
		System.out.println(Arrays.equals(arr01, arr02));
		
		int[] arr03 = Arrays.copyOf(arr01, 3);
		System.out.println(Arrays.toString(arr03));
		
		int[] arr04 = Arrays.copyOf(arr01, 8);
		System.out.println(Arrays.toString(arr04));
		int[] arr06 = Arrays.copyOfRange(arr01, 2, 4);
		System.out.println(Arrays.toString(arr06));
		
		//배열의 정렬 - sort() 
		int [] arr05 = {3, 4, 56,234, 0 ,1 };
		Arrays.sort(arr05);
		System.out.println(Arrays.toString(arr05));
	}
}
