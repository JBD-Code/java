class Parent08{
	
	int x, y ; 
	
	Parent08(int x, int y){
		this.x=x;
		this.y=y;
	}
	String getLocation() {
		return "x : " +x + ", y : " +y;
	}
}

class Child08 extends Parent08{
	
	int z;  
	
	Child08(int x, int y, int z){
		super(x,y);
		//this.x=x; 
		//this.y=y; 
		this.z=z; 
	}
	String getLocation() {
		return "x : " +x + ", y : " +y + ", z :" +z;
	}
	
}

public class SuperEx03 {
	public static void main(String[]args){
		//super() ������ ������ 
		//������ �����ڸ� ȣ���� �� ��� 
		//������ ����� ������ �����ڸ� ȣ���ؼ� ��� 
		//�������� ù�ٿ��� �ݵ�� �����ڸ� ȣ���ؾ� �Ѵ� 
		//�׷��� ������ �����Ϸ��� �������� ù�ٿ� super()�� ����  
		Child08 c = new Child08(4, 5, 6); 
		System.out.println(c.getLocation());
	}
}
