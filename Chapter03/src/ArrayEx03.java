import java.util.Arrays;

public class ArrayEx03 {
	public static void main(String[]args){
		int []iArr = new int[45];
		
		for(int i=0; i<iArr.length; i++){
			iArr[i]=i+1; 
		
		}
		System.out.println(Arrays.toString(iArr));
		int tmp=0; 
		int j=0;
		
		
		for(int i=0; i<6; i++){
			j=(int)(Math.random()*45);
			tmp = iArr[i];
			iArr[i]=iArr[j];
			iArr[j]=tmp; 
		}
		System.out.println(Arrays.toString(iArr));
		
		for(int i=0; i<6; i++){
			System.out.printf("iArr[%d]=%d%n", i, iArr[i]);
		}
	}
}
