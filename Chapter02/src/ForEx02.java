
public class ForEx02 {
	public static void main(String[]args){
		//중첩 for 문  
		//for문 안에 다른 for 문을 포함시킬수 있다 

		for(int i=2; i<=9; i++){
			for(int j =1; j<9; j++){
				System.out.println(i + "*" + j + "=" + (i*j));
			}
			System.out.println();
		 }
		
		
		for(int i=1; i<5; i++){
			System.out.println("**********");
		}
		
		
		for(int i=1; i<5; i++){
			for(int j=1; j<10; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	
	
		for(int i=1; i<=10; i++){
			for(int j=1; j<i; j++){
				System.out.print("*");
			}
			System.out.println("*");
		}
	
	
	}
	
	
	
}
