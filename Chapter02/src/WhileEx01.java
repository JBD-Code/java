import java.util.Scanner;

public class WhileEx01 {
	public static void main(String[]args){
		//while �� 
		//������ ������Ű�� ���� {}�� �ݺ� - �ݺ�Ƚ���� �� �� �̿�
		//for���� while ���� 100% ȣȯ 
		/*
		
		while(���ǽ�) {
			���ǽ��� ���� ����� true�� ���� �ݺ��� ���� 
		}

		*/
		
		int i = 5; 
		while(i--!=0){
			System.out.println(i);
		}
		///////////////////////////////////
		
		Scanner scan = new Scanner(System.in);
		int sum =0; 
		int num =0;
		
		while(sum<100){
				
			sum=++i;
		
			System.out.println(sum);
		}
		///////////////////////////////////
		num =12345;  
		sum =0; 
		while(num>0){
			
			sum += num %10; 
			System.out.println("sum"+ sum + "num%10"+num%10);
			num = num/ 10;
		}
		
		System.out.println("Total Number " + sum);
	
		//do-while�� 
		
		int input = 0, answer= 0; 
		answer = (int)(Math.random()*100) +1;
		do {
			System.out.println("1�� 100������ ���ڸ� �Է����ּ��� ");
			input =scan.nextInt(); 
			if(input> answer){
				System.out.println("�� ���� ���� �Է��ϼ���");
			}else if(input < answer){
				System.out.println("�� ū ���� �Է��ϼ���");
			}
		} while(input !=answer);
		
		System.out.println("�����Դϴ�");
	}
}
