class A2{
	void autoPlay(In i){
		i.play();
	}
}
interface In{
	public abstract void play(); 
}
class B2 implements In {
	public void play(){
		System.out.println("play in B class");
	}
}
class C2 implements In {
	public void play(){
		System.out.println("Play in C class");
	}
}
public class InterfaceEx03 {
	public static void main(String[]args){
		//�������̽��� ���� 
		//�� ���(��ü)���� ����, ��ȭ, ������ ���� �߰� ������ �Ѵ� 
		//����� ������ �и���ų �� �ִ� 
		
		//���� �ð��� ������ �� �ִ� 
		//���濡 ������ ���� 
		//ǥ��ȭ�� �����ϴ� 
		//���� ���� ���� Ŭ�������� ���踦 �ξ��� �� �ִ� 
		
	
		A2 a = new A2();
		a.autoPlay(new B2());
		a.autoPlay(new C2());
	}
}
