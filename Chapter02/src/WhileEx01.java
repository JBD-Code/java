import java.util.Scanner;

public class WhileEx01 {
	public static void main(String[]args){
		//while 문 
		//조건을 만족시키는 동안 {}을 반복 - 반복횟수를 모를 때 이용
		//for문과 while 문은 100% 호환 
		/*
		
		while(조건식) {
			조건식의 연산 결과가 true인 동안 반복될 문장 
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
	
		//do-while문 
		
		int input = 0, answer= 0; 
		answer = (int)(Math.random()*100) +1;
		do {
			System.out.println("1과 100사이의 숫자를 입력해주세요 ");
			input =scan.nextInt(); 
			if(input> answer){
				System.out.println("더 작은 수를 입력하세요");
			}else if(input < answer){
				System.out.println("더 큰 수를 입력하세요");
			}
		} while(input !=answer);
		
		System.out.println("정답입니다");
	}
}
