class Method {
	static void printArr(int[] numArr){
		for(int i=0; i<10; i++){
			System.out.printf("numArr[%d]=%d%n",i, numArr[i]);
		}
	}
}
public class MethodEx01 {
	public static void main(String[]args){
		//Method 
		//문장을 묶은 것 
		//값(입력)을 받아서 처리하고 , 결과를 반환(출력) 
		
		//Method의 장점
		//코드의 중복을 줄인다 
		//코드의 관리가 쉽다
		//코드 재상용이 용이하다 
		//코드가 간결해서 이해하기 쉬워진다 
		int [] numArr = new int[10];
		
		for(int i=0; i<10; i++){
			numArr[i] = (int)(Math.random()*10);
		}
		
		for(int i=0; i<10; i++){
			System.out.printf("%d%n", numArr[i]);
		}
		
		for(int i=0; i<10; i++){
			System.out.printf("%d%n", numArr[i]);
		}
		
		Method m = new Method(); 
		m.printArr(numArr);
		
		//반복적으로 수행되는 여러문장을 메서드로 작성 
		//하나의 메서드는 하나의 기능만 수행하도록 작성
		//메서드 = 선언부 + 구현부 
		/*
		 반환타입 메서드 이름 (타입 변수명, 타입 변수명 ) - 선언부 { 
				- 구현부 
		} 
			
		int add(int a, int b ) - 선언부 {
		
			int result = a + b; 구현부  
			return result 
		
		}	
		
		*/
	
	}
}
