
public class AnonymousClassEx01 {
	Object iv = new Object(){void method(){}}; // �͸� Ŭ���� 
	static Object cv = new Object(){void method(){}}; //�͸� Ŭ����
	
	void method() {
		Object lv = new Object() {void method(){}};//�͸� Ŭ���� 
	}
	
	public static void main(String[]args){
		//anonymous class 
		//�̸��� ���� ��ȸ�� Ŭ���� ���ǿ� ������ ���ÿ� �Ѵ� 
		//new ����Ŭ������ �̸� () {
			//��� ���� 
		//}
		
		//new �����������̽��̸�() {
			//��� ���� 
		//}
	}
}
