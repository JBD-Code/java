import java.util.Arrays;

public class ArrayEx04 {
	public static void main(String[]args){
		//String �迭�� ����� ���� 
		String[] name = new String[3];
		name[0] = "name00";
		name[1] = "name01";
		name[2] = "name02";
		
		System.out.println(Arrays.toString(name));
	
		//////////////////////////////////////////
		String [] strArr = {"����", "����", "��"};
		for(int i=0; i<10; i++){
			int count = (int)(Math.random()*3);
				System.out.println(strArr[count]);
		}
	
	}
}
