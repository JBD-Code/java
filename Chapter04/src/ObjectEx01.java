class Tv{
	
	String color; 
	boolean power; 
	int channel;
	
	public void power(){
		power =!power ;
	}
	public void channelUp(){
		++channel; 
		
	}
	public void channelDown(){
		--channel;
	}
	
}

public class ObjectEx01 {
	public static void main(String[]args){
		//��ü���� ��� 
		//Ŭ������ ��ü 
		//Ŭ������ ���� - ��ü�� ������ ���� �� 
		//Ŭ������ �뵵 - ��ü�� �����ϴµ� ��� 
		
		//��ü�� ���� ������ �����ϴ� �� �繰 �Ǵ� ���� 
		//��ü�� �뵵 ��ü�� ������ �ִ� ��ɰ� �Ӽ��� ���� �ٸ��� 
		//��ü = �Ӽ�(����) + ���(�޼���) 
		
		
		//��ü : ��� �ν��Ͻ��� ��ǥ�ϴ� �Ϲ��� ��� 
		//�ν��Ͻ� : Ư�� Ŭ���κ��� ������ ��ü 
		
		//��ü�� ������ ��� 
		//Ŭ������ ������ ; 
		//������ = new Ŭ������() 
				
		//Tv t; 
		//t = new Tv() ;
		Tv t; 
		t = new Tv(); 
		t.channel=7;
		
		t.channelDown();
		System.out.println(t.channel);
	
	}
}
