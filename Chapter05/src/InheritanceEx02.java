class Point {
	int x ; 
	int y ; 
}
class Circle extends Point{
	Point p = new Point(); 
	int z ; 
	
}	
public class InheritanceEx02 {
	public static void main(String[]args){
		//composite ���� 
		//Ŭ������ ����� ���������� �����ϴ� �� 
		//��� ���� A�� B�̴� 
		//���� ���� A�� B�� ������ �ִ� 
		
		Circle c = new Circle(); 
		c.x=1; 
		c.y=2; 
		c.z=3; 
		System.out.println("c.x="+ c.x);
		System.out.println("c.y="+ c.y);
		System.out.println("c.z="+ c.z);
		c.p.x=4; 
		c.p.y=5; 
		c.z=6; 
		System.out.println("c.p.x="+ c.p.x);
		System.out.println("c.p.y="+ c.p.y);
		System.out.println("c.z="+ c.z);
	
	}
}
