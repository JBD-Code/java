import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayEx02 {
	public static void main(String[]args){
		int sum = 0; 
		float average = 0f; 
		
		int [] score = {100, 90, 80, 85, 75};
		
		for(int i=0; i<score.length; i++){
			sum += score[i];
		}
		average = sum / (float)score.length;
		
		System.out.println("ÃÑÁ¡ : "+ sum );
		System.out.println("Æò±Õ : "+ average );
		////////////////////////////////////////
		int[] score1 = {79, 88, 91, 33, 100, 50,  95};
		int max =score1[0];
		int min =score1[0];
		
		for(int i=0; i<score1.length; i++){
			if(score1[i]>max){
				
				max=score1[i];
			
			}else if(score1[i]<min){
				
				min=score1[i];
			}
		}
		System.out.println("Max :" + max);
		System.out.println("Min :" + min );
		////////////////////////////////////////
		
		int[]numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(numArr));
		
		for(int i=0; i< 100; i++){
			int n = (int)(Math.random() *10);
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] =tmp;
		}
		System.out.println(Arrays.toString(numArr));
	}
}
