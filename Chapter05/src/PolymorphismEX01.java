class Tv06{
	boolean power; 
	int channel; 
	
	void power () {
		power =!power; 
	}
	void channelUp(){
		++channel;
	}
	void channelDown(){
		--channel;
	}
}

class SmartTv06 extends Tv06{
	
	String text; 
	void caption(){
		
	}
}


public class PolymorphismEX01 {
	public static void main(String[]args){
		//Polymorphism ������ 
		//���� ���� ���¸� ���� �� �ִ� �ɷ� 
		//���� Ÿ�� ���� ������ �ڼ� Ÿ�� ��ü�� �ٷ�� �� 
		//�ڼ� Ÿ���� ���� ������ ���� Ÿ���� ��ü�� ����ų �� ���� 
	
		SmartTv06 s = new SmartTv06(); 
		//SmartTv06 s1 = new Tv(); Error
		Tv06 t = new SmartTv06();
	
	}
}
