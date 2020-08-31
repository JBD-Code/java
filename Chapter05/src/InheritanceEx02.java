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
		//composite 관계 
		//클래스의 멤버로 참조변수로 선언하는 것 
		//상속 관계 A는 B이다 
		//포함 관계 A는 B를 가지고 있다 
		
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
