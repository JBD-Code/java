import java.util.Scanner;

public class ScanEx01 {
	public static void main(String []args){
	//화면에서 입력받기 - Scanner 
		//Scanner?
		//화면으로 부터 데이터를 입력받는 기능을 제공하는 class 
		//import문 추가 
		//Scanner 객체의 생성 
		
		Scanner scan = new Scanner(System.in);
		//int num = scan.nextInt();
		//int num01 = scan.nextInt();
		//System.out.println(num+ num01);
		String input = scan.nextLine();
		int num02 = Integer.parseInt(input);
		System.out.println(num02);
	}
}
