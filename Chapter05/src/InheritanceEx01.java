class Tv{
	boolean power; 
	int channel ;

	void power(){
		power = !power; 
	}
	void channelUp(){
		++channel;
	}
	void channelDown(){
		--channel; 
	}
}

class SmartTv extends Tv {
	boolean caption;
	void displayCaption(String text){
		if(caption){
			System.out.println(text);
		}
	}
}


public class InheritanceEx01 {
	public static void main(String[]args){
		//Inheritance
		//������ Ŭ������ ���ο� Ŭ������ �ۼ��ϴ� �� 
		//�� Ŭ������ �θ� �ڽ����� ���踦 �ξ��ִ� �� 
		//�ڼ��� ������ ��� ����� ��ӹ޴´�(������, �ʱ�ȭ ���� ����) 
		//�ڼ��� ��� ������ ���� ���� ���� �� ����(���ų� ����)
		//�ڼ��� ������ ���� ������ ��ġ�� �ʴ´� 
		
		SmartTv stv = new SmartTv(); 
		stv.channel=10;
		stv.channelUp();
		System.out.println(stv.channel);
		stv.displayCaption("Hello World");
		stv.caption = true;
		stv.displayCaption("Hello World");
		stv.channelDown();
		System.out.println(stv.channel);
		
		
		
	}
}