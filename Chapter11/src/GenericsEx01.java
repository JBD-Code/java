import java.util.ArrayList;

public class GenericsEx01 {
	public static void main(String[]args){
		//Generics? 
		//�����Ͻ� Ÿ���� üũ�� �ִ� ��� (compile-time type check) JDK1.5
		/*
		ArrayList list = new ArrayList();//JDK1.5 ���� Generic ���� ���� 
		list.add(10);
		list.add(20);
		list.add(30);
		list.add("30"); //String�� �߰� 
		
		Integer i= (Integer)list.get(3); 
		//compile ���������� ClassCastException compile�� �Ѱ� 
		//����� ���� < �����Ͽ��� 
		//����� �߻��ϴ� ������ �������� �� �ľ��ϱ� ���� ������ Generic�� ��
		System.out.println(i);
		System.out.println(list);
		 */
		
		//ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(10);		
		list.add(20);		
		list.add(30);		
		list.add("30"); 
		Integer i = (Integer)list.get(3);
		String str = (String)list.get(3);
		System.out.println(list);
		
		//��ü�� Ÿ�� �������� �����Ѵ�  
		//Ÿ��üũ�� ����ȯ�� ������ �� �����Ƿ� �ڵ尡  ���������� 
		
		
	}
}
