import java.util.Scanner;

public class ScanEx01 {
	public static void main(String []args){
	//ȭ�鿡�� �Է¹ޱ� - Scanner 
		//Scanner?
		//ȭ������ ���� �����͸� �Է¹޴� ����� �����ϴ� class 
		//import�� �߰� 
		//Scanner ��ü�� ���� 
		
		Scanner scan = new Scanner(System.in);
		//int num = scan.nextInt();
		//int num01 = scan.nextInt();
		//System.out.println(num+ num01);
		String input = scan.nextLine();
		int num02 = Integer.parseInt(input);
		System.out.println(num02);
	}
}
