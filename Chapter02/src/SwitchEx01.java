import java.util.Scanner;

public class SwitchEx01 {
	public static void main(String[]args){
		//Switch �� 
		//ó���ؾ� �ϴ� ����� ���� ���� �� ������ ���ǹ� 
		/*
		switch(���ǽ�) {
			1 ���ǽ��� ����Ѵ� 
			2 ���ǽ��� ����� ��ġ�ϴ� case ������ ����Ѵ� 
			3 ������ ������� �����Ѵ� 
			4 break���̳� switch���� ���� ������ switch�� ��ü�� ���� ������ 
		
			case ��1 :
			 	���ǽ��� ����� �� 1�� ���� ��� ������ ���� 
			 	break; 
			case ��2 :
				���ǽ��� ����� �� 2�� ���� ��� ������ ���� 
				break; 
			case ��3 :
				���ǽ��� ����� �� 3�� ���� ��� ������ ���� 
				break; 
				
			default : 
				���ǽ��� ����� ��ġ�ϴ� case���� ���� ��� ������ ���� 
		}
		
		// switch ���� ���� ���� 
		 1 switch ���� ����� ���� �Ǵ� ���ڿ��̾�� �Ѵ� 
		 2 case ���� ���� ����, ���, ����, ���ڿ��� �����ϸ� �ߺ����� �ʾƾ� �Ѵ�  
		 3 �Ǽ��� ������ ����� �Ұ��� �ϴ� 
		
		*/
		
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		
		switch(month) {
			case 3:case 4: case 5: 
				System.out.println("Spring");
				break;
			case 6: case 7: case 8: 
				System.out.println("Summer");
				break;
			case 9: case 10: case 11: 
				System.out.println("Fall");
				break; 
			//case 12: case 1: case 2:	
			default :
				System.out.println("Winter");
		}
		
		//������ ���� ����� 
		//Math.random() 0.0~1.0 ������ ������ double ���� ��ȯ 
		//0.0 <= Math.random() <1.0
		
	}
}
