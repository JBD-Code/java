import java.util.Scanner;

public class IFEx02 {
	public static void main(String[]args){
		//��ø if�� 
		// if�� ���� if�� 
		/*
		if(���ǽ�1) {
			���ǽ� 1�� ���� ����� true�� �� ������ ���� 
			if(���ǽ�2) {
				���ǽ� 1�� ���ǽ� 2�� ��� true�� �� ������ ��¡
			}else {
				���ǽ�1�� true�̰� ���ǽ� 2�� false �� ��  ������ ����
			}
		}else {
			���ǽ� 1�� false �� �� ������ ���� 
		}	
		*/
		Scanner scan = new Scanner (System.in);
		
		char opt =' ';
		char grade = 'F';
		int score = scan.nextInt(); 
		
		if(score> 90){
			grade ='A';
			if(score >= 98){
				opt = '+';
			}else if(score < 94){
				opt = '-';
			}
		}else if(score>=80){
			grade ='B';
			if(score >= 88){
				opt = '+';
			}else if(score < 84){
				opt = '-';
			}
		}else if(score>=70){
			grade ='C';
			if(score >= 78){
				opt = '+';
			}else if(score < 74){
				opt = '-';
			}
		}else if(score>=60){
			grade ='D';
			if(score >= 68){
				opt = '+';
			}else if(score < 64){
				opt = '-';
			}
		}
		System.out.printf("����� ������ %d�̰� ����� %c%c�Դϴ�", score, opt,grade);

	}
}
