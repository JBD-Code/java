import java.util.Arrays;

public class ArrayEx01 {
	public static void main(String[]args){
		//Array 

		//배열의 선언과 생성 

		//타입 [] 변수이름 // 배열을 선언 (배열을 다루기 위한 참조 변수 선언)
		//변수이름 = new 타입[길이] //배열을 생성 (실제 공간을 생성) 
		//int[] score;
		//score =new int[5];
		
		int [] score ; 		//1. 배열 score를 선언 (참조변수) 
		score =new int[5];  //2. 배열의 생성 
		score[3] =100; 
		System.out.println("score[3]="+score[3]);
		System.out.println("score[0]="+score[0]);
		System.out.println("score[1]="+score[1]);
		System.out.println("score[2]="+score[2]);
		System.out.println("score[4]="+score[4]);
		
		
		//배열의 길이 
		//베열이름.length - 베열의 길이(int형 상수)
		//배열은 한번 생성함녀 그 길이를 바꿀 수 없다 
		
		int []arr =new int[10]; //길이가 5인 int 배열 
		int tmp = arr.length;  
		
		for(int i=0; i<arr.length; i++){
			System.out.println("arr["+i+"]=" +arr[i]);
		}
		
		//베열의 초기화 
		//베열의 각 요소에 처읍으로 값을 저장하는 것 
		int []score01 = new int[5];
		score[0] =50;
		score[1] =60;
		score[2] =70;
		score[3] =80;
		score[4] =90;
		
		int[] score02 = {50, 60, 70, 80, 90}; 
		
		//베열의 출력 
		
		int[]iArr = {100, 90, 85, 75, 70};
		int[]iArr1 = new int[10];
		int[]iArr2 = new int[10];
		char[] chArr = {'a', 'b', 'c', 'd'};

		for(int i=0; i<iArr1.length; i++){
			iArr1[i] =i+1;
		}
		for(int i=0; i<iArr1.length; i++){
			System.out.println(iArr1[i]);
		}
		
		System.out.println(Arrays.toString(iArr1));
		System.out.println(iArr1);
		System.out.println(chArr);
		
		for(int i=0; i<iArr.length; i++){
			System.out.println("iArr["+ i+"]="+iArr[i]);
		}
		
		System.out.println(Arrays.toString(iArr));
		
		
	}
}
