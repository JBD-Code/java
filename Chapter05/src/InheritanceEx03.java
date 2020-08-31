class Parent03 {
	int x; 
	int y;
	String getLocation(){
		return "x:" +x+  ", y :" + y;
	}
	
}
class Child03 extends Parent03{
	int z; 

	String getLocation(){
		return "x:" +x+  ",y:" + y + ",z:"+z;
	}

}

public class InheritanceEx03 {
	public static void main(String[]args){
		//Overriding
		Child03 c = new Child03(); 
		c.x=3;
		c.y=4; 
		c.z=5; 
		System.out.println(c.getLocation());
		
	}
}
