import java.util.Scanner;

public class IFEx02 {
	public static void main(String[]args){
		//중첩 if문 
		// if문 안의 if문 
		/*
		if(조건식1) {
			조건식 1의 연산 결과가 true일 때 수행할 문장 
			if(조건식2) {
				조건식 1과 조건식 2가 모두 true일 때 수행할 문징
			}else {
				조건식1이 true이고 조건식 2가 false 일 때  수행할 문장
			}
		}else {
			조건신 1이 false 일 때 수행할 문장 
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
		System.out.printf("당신의 점수는 %d이고 등급은 %c%c입니다", score, opt,grade);

	}
}
