import java.util.HashMap;
import java.util.Scanner;

public class CollectionsEx21 {
	public static void main(String[]args){
		//HashMap �� Hashtabl - ���� x �ߺ�( ŰX, �� O) 
		//Map �������̽��� ����, �����͸� Ű�� ���� ������ ���� 
		//HashMap (����ȭ X) Hashtable(����ȣ O)�� �Ź��� 
		
		//HashMap 
		//Map �������̽��� ������ ��ǥ���� �÷��� Ŭ���� 
		//������ �����Ϸ��� LinkedHashMapŬ������ ����ϸ� �ȴ� 
		
		//TreeMap 
		//���� �˻��� ���Ŀ� ������ �÷��� Ŭ���� 
		//HashMap���� ������ �߰� ������ �ð��� �ɸ��� 
		
		//HashMap�� Ű(key)�� ��(value)
		//�ؽ�(hashing)������� �����͸� ����, �����Ͱ� ���Ƶ� �˻��� ������ 
		//Map �������̽��� ����, �����͸� Ű�� ���� ������ ���� 
		//key 	�÷��� ���� key �߿��� �����ؾ� �Ѵ� 
		//value key�� �޸� �������� �ߺ��� ����Ѵ� 
		
		//hashing 
		//�ؽ� �Լ�(hash function)�� �ؽ����̺�(hash table)�� �����͸� ����, �˻� 
		//�ؽ����̺��� �迭�� ��ũ�� ����Ʈ�� ���յ� ���� 
		//�ؽ� �ؽ� ���̺� ����� �����͸� �������� ���� 
		//	1 key�� �ؽ� �Լ��� ȣ���ؼ� �ؽ��ڵ带 ��´� 
		//	2 �ؽ��ڵ�(�ؽ��Լ��� ��ȯ��)�� �����ϴ� ��ũ�帮��Ʈ �迭���� ã�´� 
		//	3 ��ũ�帮��Ʈ���� Ű�� ��ġ�ϴ� �����͸� ã�´� 
		
		
		HashMap map = new HashMap(); 
		map.put("myId", "1234");
		System.out.println(map);
		map.put("asdf", "1111"); 
		System.out.println(map);
		map.put("asdf", "1234");
		System.out.println(map);
		
		Scanner scan = new Scanner(System.in);
		
		while(true){
			System.out.println("id�� password�� �Է����ּ���");
			System.out.print("id :");
			String id = scan.nextLine().trim(); 
			
			System.out.print("password :");
			String password = scan.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)){
				System.out.println("�Է��Ͻ� id�� �������� �ʽ��ϴ� . �ٽ� �Է����ּ��� ");
				continue;
			}
			
			if(!("1234").equals(password)){
				System.out.println("��й�ȣ�� ��ġ ���� �ʽ��ϴ�. �ٽ� �Է����ּ���");
			}else {
				System.out.println("id�� ��й�ȣ�� ��ġ �մϴ�");
				break;
			}
		}
		
	}
}
