class Card {
	//�ν��Ͻ� ���� �������� �Ӽ� 
	String kind ; // ���� 
	int number ; // ���� 
	
	
	//Ŭ���� ���� �������� �Ӽ�
	static int width = 100; //�� 
	static int height = 250; // ���� 
}


class Variable{
	
	int iv; // �ν��Ͻ� ����  : �ν��Ͻ��� �����Ǿ��� �� 
	static int cv; //Ŭ���� ���� : Ŭ������ �޸𸮿� �ö� �� 
	
	void method(){
		int lv; // �������� : ���� ������ ����Ǿ��� �� 
	}
}
public class ObjectEx04 {
	public static void main(String[]args){
		//���� ��ġ�� ���� ������ ���� 
		Card c1= new Card(); 
		c1.kind = "HEART";
		c1.number = 5; 
		
		Card c2 = new Card(); 
		c2.kind = "Spade";
		c2.number = 4; 

		System.out.println("Card.width:"+Card.width);
		System.out.println("Card.height:"+Card.height);
		System.out.println("c1�� "+c1.kind +", "+c1.number + "�̸� ũ��� ("+ c1.width +"/"+c1.height+ ")�Դϴ�");
		System.out.println("c2�� "+c2.kind +", "+c2.number + "�̸� ũ��� ("+ c2.width +"/"+c2.height+ ")�Դϴ�");
		System.out.println("c1�� width�� height�� ���� 50, 80���� �����մϴ�");
		c1.height = 50; 
		c1.width = 80 ; 
		System.out.println("c1�� "+c1.kind +", "+c1.number + "�̸� ũ��� ("+ c1.width +"/"+c1.height+ ")�Դϴ�");
		System.out.println("c2�� "+c2.kind +", "+c2.number + "�̸� ũ��� ("+ c2.width +"/"+c2.height+ ")�Դϴ�");
		//Ŭ���������� ��� ���������� �̿��ϱ� ���ٴ� Ŭ�������� �̿��Ѵ� 
	}
}
