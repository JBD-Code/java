
public class ObjectEx02 {
	public static void main(String[]args){
		Tv t1 = new Tv();
		Tv t2 = new Tv(); 
		
		System.out.println("t1�� channel�� ���� " +t1.channel+"�Դϴ�");
		System.out.println("t2�� channel�� ���� " +t2.channel+"�Դϴ�");

		t1.channel = 7; 
		t2 = t1;
		System.out.println("t1�� channel�� ���� " +t1.channel+"�Դϴ�");
		System.out.println("t2�� channel�� ���� " +t2.channel+"�Դϴ�");
	
		//��ü �迭 
		//��ü �迭 == ���� �����迭 
		Tv[] tvArr = new Tv[3];
		tvArr[0] = new Tv();
		tvArr[1] = new Tv();
		tvArr[2] = new Tv();
		
	}
	
}
