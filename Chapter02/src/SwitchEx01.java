import java.util.Scanner;

public class SwitchEx01 {
	public static void main(String[]args){
		//Switch 문 
		//처리해야 하는 경우의 수가 많을 때 유용한 조건문 
		/*
		switch(조건식) {
			1 조건식을 계산한다 
			2 조건식의 결과와 일치하는 case 문으로 디오한다 
			3 이후의 문장들을 수행한다 
			4 break문이나 switch문의 끝을 만나면 switch문 전체를 빠져 나간다 
		
			case 값1 :
			 	조건식의 결과가 값 1과 같을 경우 수행할 문장 
			 	break; 
			case 값2 :
				조건식의 결과가 값 2와 같을 경우 수행할 문장 
				break; 
			case 값3 :
				조건식의 결과가 값 3과 같을 경우 수행할 문장 
				break; 
				
			default : 
				조건식의 결과와 일치하는 case문이 없을 경우 수행하 문장 
		}
		
		// switch 문의 제약 조간 
		 1 switch 문의 결과는 정수 또는 문자열이어야 한다 
		 2 case 문의 값은 정수, 상수, 문자, 문자열만 가능하며 중복되지 않아야 한다  
		 3 실수와 변수는 사용을 불가능 하다 
		
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
		
		//임의의 정수 만들기 
		//Math.random() 0.0~1.0 사이의 임의의 double 값을 반환 
		//0.0 <= Math.random() <1.0
		
	}
}
