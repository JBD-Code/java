package com.access.ex01;
class staticTest{
	
	static int width  =200; 
	static int height =100; 
	
	static {
		
	}
	
	static int max(int a,  int b ){
		return a > b ? a : b ;
	}
}

final class finalTest { //Ȯ��� �� ���� Ŭ����, ������ �� �� ���� Ŭ����  
	
	final int MAX_SIZE = 10; //���� ������ �� ���� �������(���)
	
	final void getMaxSize() {	//�������̵� �� �� ���� �޼��� 
		
		final int LV = MAX_SIZE; //���� ������ �� ���� ����(���)
		
	}
	
}

abstract class AbstractTest{ //�߻󴊷��� �߻�޼��带 ������ Ŭ���� 
	
	abstract void move(); //�߻�޼��� �����ΰ� ���� �޼��� 
}

public class AccessModifierEx01 {
	public static  void main(String[]args){
		//Modifier ������ 
		//Ŭ������ Ŭ������ ���(����, �޼���)�� �ΰ����� �ǹ̸� �ο� 
		//���� ������ public, protected, default, private  
		//�ϳ��� ��� �����ڸ� ���� ��밡�� ������, ���� �����ڴ� �ϳ��� ��밡�� 
		//static - Ŭ������ �������� ��� ����, �޼��� 
		
	}
}
