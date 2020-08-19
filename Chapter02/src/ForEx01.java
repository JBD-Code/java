
public class ForEx01 {
	public static void main(String[]args){
		//for문 
		//조건을 만족하는 동안 {} 블록을 반복 - 반복횟수를 알 때 적합하다 
		/*
			 ①	   ②	  ④	
		for(초기화; 조건식; 증감식;){
		 		   
		 		  ③
		 	       수행할 문장 
		}
		*/
		int num = 0; 
		
		for(int i=1; i<=20; i++){
			//System.out.println(Math.random()); 	//0.0 <=x < 1.0
			//System.out.println(Math.random()*10);	//0.0 <=x < 10.0
			//System.out.println((int)(Math.random()*10));	// 0<= x < 10 
			//System.out.println((int)(Math.random()*11));	// 0<= x < 11
			System.out.println((int)(Math.random()*11)-5);  // -5 <= x < 6	
		}
		
		//for(int i=1; i<=3; i++ ){
		for(int i=1; i<=3; i+=2 ){
			System.out.println("Java");
		}

		for(int i=1, j=10; i<10; i++, j--){
			System.out.println("i=" +i+ " j =" +j);
		}
		
		int sum=0; 
		for(int i=1; i<=5; i++){
			sum +=i;
		}
		System.out.println(sum);
		
		
		//조건식을 생략하면, true로 간주되기 때문에 무한반복문이 된다 
		
		for(;true;){ 
			System.out.println("Hello");
		}
		
	}
}
