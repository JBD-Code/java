class Parent06{
	int x = 10 ; 
}
class Child06 extends Parent06{
	int x =20; 
	
	void method(){
		System.out.println("x=" +x);
		System.out.println("this.x=" +this.x);
		System.out.println("super.x=" +super.x);
	}
	
}
public class SuperEx01 {
	public static void main(String[]args){
		//�������� super 
		//��ü �ڽ��� ����Ű�� ���� ����, instance method(�ļ���)�������� ���� 
		//������  ����� �ڽ��� ����� ������ �� ��� 
		Child06 c = new Child06(); 
		c.method();
	}
}
