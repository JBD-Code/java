package com.access.ex01;

public class MyParent{

	private   int prv; // ���� Ŭ����  
			  int dft; // ���� ��Ű�� 
	protected int prt; // ���� ��Ű�� + �ڼ� ��Ű�� 
	public 	  int pub; // ���� ���� ���� 
	
	
	public void printMembers() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
}

class AccessModifierEx02 {
	public static void main(String []args){
		//access modifier ����������
		//private   ���� Ŭ���� �������� ������ �����ϴ� 
		//default   ���� ��Ű�� �������� ������ �����ϴ� 
		//protected ���� ��Ű�������� �׸��� �ٸ� ��Ű���� �ڼ� Ŭ�������� ������ �����ϴ� 
		//public 	���� ������ ���� ���� 
		
		MyParent p = new MyParent(); 
		//System.out.println(p.prv); Error 
		System.out.println(p.dft);
		System.out.println(p.prt);
		System.out.println(p.pub);
		
	}
}
