interface Moveable{
	void move(int x, int y); 
}

interface Attackable{
	void attack(Unit u);
}

public interface InterfaceEx01 extends Moveable, Attackable{
	//interface 
	//�߻� �޼����� ���� 
	//���� �� ���� ���� ���赵(��� ����� public) 
	//public static final Ÿ�� ����̸� = �� ;
	//public abstract �޼����̸�( �Ű����� ���); 
	
	public static final int SPADE = 4; 
	final int DIAMOND = 3 ; 
	static int HEART = 2;
	int CLOVER =1; 
	
	public abstract String getCardNumber(); 
	String getCardKind();
	//public, static, final ������ ���� 
	//�������̽��� ������ �������̽��� �����ϴ� (Object�� �ְ� ������ �ƴϴ�) 
	//���� ����� �����ϴ� ������ ������ ���� �� �ִ� 
	
	//interface�� ���� 
	//�������̽��� ���ǵ� �߻� �޼��带 �ϼ��ϴ� �� 
	//class Ŭ�����̸� implements �������̽� �̸� { 
		//�������̽��� ���ǵ� �߻�޼��带 ��� ���� �ؾ� �Ѵ� 

	//}
	
	//�߻�Ŭ������ �������̽��� �������� �߻� �޼��带 ������ ������ �̿ϼ��� ���赵�̴� 
	//�߻�Ŭ������ �������̽��� �������� iv�� ������ �ִ°� ���°��̴� 
	
}

class Fighter implements InterfaceEx01 {

	@Override
	public void attack(Unit u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getCardNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCardKind() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
