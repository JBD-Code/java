class Point04 extends Object{
	int x; 
	int y; 
	
	public String toString() {
		return "x:" +x+ ", y:"+ y;
	}
}

public class InheritanceEx04 {
	public static void main(String []args){
		Point04 p =new Point04(); 
		p.x=3; 
		p.y=5;
		System.out.println(p);
		System.out.println("p.x:"+p.x);
		System.out.println("p.y:"+p.y);
		System.out.println(p.toString());
	}
}
