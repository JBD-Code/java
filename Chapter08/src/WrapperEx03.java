import java.util.ArrayList;

public class WrapperEx03 {
	public static void main(String[]args){
		//Autoboxing Unboxing
		//�⺻�� - > ������ 
		//������ - > �⺻�� 
		
		//JDK1.5 �������� �⺻���� ���������� �������� �Ұ��� 
		//������ ���� �ڵ�
		int i =5;
		Integer iObj = new Integer(7);
		int sum = i+ iObj;
		System.out.println(sum);
		
		
		//������ ���� �ڵ� 
		//int i =5;
		//Integer iObj = new Integer(7);
		//int sum = i+ iObj.intValue();
		//System.out.println(sum);
		
		ArrayList<Integer>list =new ArrayList<Integer>();
		list.add(10);//JDK1.5 �������� ���� 
		//Integer value = list.get(0);		
		//list.add(new Integer(10));
		int value = list.get(0);
		//int value = list.get(0).intValue();
		System.out.println(value);
		
	}
}
