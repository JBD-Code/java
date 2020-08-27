
public class ObjectEx02 {
	public static void main(String[]args){
		Tv t1 = new Tv();
		Tv t2 = new Tv(); 
		
		System.out.println("t1의 channel의 값은 " +t1.channel+"입니다");
		System.out.println("t2의 channel의 값은 " +t2.channel+"입니다");

		t1.channel = 7; 
		t2 = t1;
		System.out.println("t1의 channel의 값은 " +t1.channel+"입니다");
		System.out.println("t2의 channel의 값은 " +t2.channel+"입니다");
	
		//객체 배열 
		//객체 배열 == 참조 변수배열 
		Tv[] tvArr = new Tv[3];
		tvArr[0] = new Tv();
		tvArr[1] = new Tv();
		tvArr[2] = new Tv();
		
	}
	
}
