import java.util.Arrays;

public class ArrayEx04 {
	public static void main(String[]args){
		//String 배열의 선언과 생성 
		String[] name = new String[3];
		name[0] = "name00";
		name[1] = "name01";
		name[2] = "name02";
		
		System.out.println(Arrays.toString(name));
	
		//////////////////////////////////////////
		String [] strArr = {"가위", "바위", "보"};
		for(int i=0; i<10; i++){
			int count = (int)(Math.random()*3);
				System.out.println(strArr[count]);
		}
	
	}
}
