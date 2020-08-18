import java.util.Scanner;

public class IFEx01 {
	public static void main(String[]args){
		//제어문  
		//조건문 : 조건을 만족할 때 {} 를 수행 (0~1)번 
		//반복문 : 조건을 만족하는 동안 {} 를 수행 (0 ~ n)번 	
		
		//if문 
		//조건식이 true 일 때 괄호 안의 문장들을 수행한다 
		/*
			if(조건식){
			 	//조건식이 true일 때 수행될 문장을 적는다 
		 	}
		*/	
			
		//if-else문 
		//조건식이  true 일 때와 false 일 때로 나눠서 처리 	
		int input = 1; 
		
		if(input ==0){
			System.out.printf("%d입니다%n", input );
		}else {
			System.out.printf("%d은 0이 아닙니다%n", input );
			
		}
		//if-else if 문 
		//여러개의 조건식을 포함한 조건식 
		/*
		if(조건식1){
			조건식 1 일 true일 때 수행될 문장
		}else if(조건식2){
			조건식 1이 false 이고 조건식 2 가 true일 때 수행될 문장   
		}else if(조건식3){
			조건식 1,2기 false 이고 조건식3 이 true일 때 수행될 문장   
		}else {
			위의 어느 조건식도 만족하지 않을 경우 수행될 문장
		}
		*/
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		//char grade= ' ';
		char grade= 'F';
		int score = scan.nextInt(); 
		//if (score >90){
		if (90 <=score &&score<=100){
			grade = 'A';
			//System.out.printf("당신의 점수는 %d이고 %c등급입니다%n", score, grade);
		//}else if (score >=80 ){
		}else if (80 <=score &&score<=89){
			grade = 'B'; 
			//System.out.printf("당신의 점수는 %d이고 %c등급입니다%n", score, grade);
		//}else if (score >=70 ){
		}else if (70 <=score &&score<=79){
			grade = 'C'; 
			//System.out.printf("당신의 점수는 %d이고 %c등급입니다%n", score, grade);
		//}else if (score >=60 ){
		}else if (60 <=score &&score<=69){
			grade = 'D'; 
			//System.out.printf("당신의 점수는 %d이고 %c등급입니다%n", score, grade);
		}
		/*
		}else {
			grade = 'F'; 
			
		}*/
		System.out.printf("당신의 점수는 %d이고 %c등급입니다%n", score, grade);
	
	}
}
