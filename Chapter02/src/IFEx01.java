import java.util.Scanner;

public class IFEx01 {
	public static void main(String[]args){
		//���  
		//���ǹ� : ������ ������ �� {} �� ���� (0~1)�� 
		//�ݺ��� : ������ �����ϴ� ���� {} �� ���� (0 ~ n)�� 	
		
		//if�� 
		//���ǽ��� true �� �� ��ȣ ���� ������� �����Ѵ� 
		/*
			if(���ǽ�){
			 	//���ǽ��� true�� �� ����� ������ ���´� 
		 	}
		*/	
			
		//if-else�� 
		//���ǽ���  true �� ���� false �� ���� ������ ó�� 	
		int input = 1; 
		
		if(input ==0){
			System.out.printf("%d�Դϴ�%n", input );
		}else {
			System.out.printf("%d�� 0�� �ƴմϴ�%n", input );
			
		}
		//if-else if �� 
		//�������� ���ǽ��� ������ ���ǽ� 
		/*
		if(���ǽ�1){
			���ǽ� 1 �� true�� �� ����� ����
		}else if(���ǽ�2){
			���ǽ� 1�� false �̰� ���ǽ� 2 �� true�� �� ����� ����   
		}else if(���ǽ�3){
			���ǽ� 1,2�� false �̰� ���ǽ�3 �� true�� �� ����� ����   
		}else {
			���� ��� ���ǽĵ� �������� ���� ��� ����� ����
		}
		*/
		System.out.println("������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		//char grade= ' ';
		char grade= 'F';
		int score = scan.nextInt(); 
		//if (score >90){
		if (90 <=score &&score<=100){
			grade = 'A';
			//System.out.printf("����� ������ %d�̰� %c����Դϴ�%n", score, grade);
		//}else if (score >=80 ){
		}else if (80 <=score &&score<=89){
			grade = 'B'; 
			//System.out.printf("����� ������ %d�̰� %c����Դϴ�%n", score, grade);
		//}else if (score >=70 ){
		}else if (70 <=score &&score<=79){
			grade = 'C'; 
			//System.out.printf("����� ������ %d�̰� %c����Դϴ�%n", score, grade);
		//}else if (score >=60 ){
		}else if (60 <=score &&score<=69){
			grade = 'D'; 
			//System.out.printf("����� ������ %d�̰� %c����Դϴ�%n", score, grade);
		}
		/*
		}else {
			grade = 'F'; 
			
		}*/
		System.out.printf("����� ������ %d�̰� %c����Դϴ�%n", score, grade);
	
	}
}
