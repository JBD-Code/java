import java.util.Scanner;

public class ArrayEx09 {
	public static void main(String[]args){
		
		String[][] word = {
							{"chair", "의자"},
							{"computer", "컴퓨터"},
							{"integer", "정수"}
						  };
		
		 Scanner scan = new Scanner(System.in);
		 for(int i=0; i<word.length; i++){
			 System.out.printf("Q%d. %s의 뜻? ", i+1, word[i][0]);
			 
			 String tmp = scan.nextLine();
			 
			 if(tmp.equals(word[i][1])){
				 System.out.printf("정답! %n%n");
			 } else {
				 System.out.printf("오답! 정답은 %s입니다 %n%n", word[i][1]);
			 }
		 }
	}
}
