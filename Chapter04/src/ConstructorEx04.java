 

class Constructor04{
	
}

class StaticBlockTest{
	static int []arr = new int[10]; //����� �ʱ�ȭ 
	
	static { //Ŭ���� �ʱ�ȭ �� 
		for(int i=0; i<arr.length; i++){
			arr[i] = (int)(Math.random()*10)+1;
		}
	}
}


public class ConstructorEx04 {
	public static void main(String[]args){
		//variable�� �ʱ�ȭ 
		//local variable�� ����ϱ����� �ݵ�� ���� �ʱ�ȭ ������ �ʿ��ϴ� 
		
		//local variable, class variable�� �ʱ�ȭ  
		//1. ����� �ʱ�ȭ (=)���� �����ڸ� ��� (���� �ʱ�ȭ) 
		
		//2. �ʱ�ȭ �ҷ� (���� �ʱ�ȭ) 
		//-�ν��Ͻ� �ʱ�ȭ ��:{} 
		//-Ŭ���� �ʱ�ȭ ��: static {} 
		
		//3. ������ (���� �ʱ�ȭ)
		
		//��������� �ʱ�ȭ 
		//class variable �� �ʱ�ȭ ���� : Ŭ������ ó�� �ε��� �� �� �ѹ� 
		//instance variable �� �ʱ�ȭ ���� : �ν��Ͻ��� ������ �� ����
	
	}
}
