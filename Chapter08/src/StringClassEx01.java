
public class StringClassEx01 {
	public static void main(String[]args){
		//String class
		//���ڿ��� �ٷ�µ� ���Ǵ� Ŭ���� 
		//String class= data(char[]) + method(���ڿ� ����) 
		//String class �� ������ ������ �� ���� �Һ�(immutable) Ŭ�����̴� 
		
		String str1 = "abc"; //���ڿ� ���ͷ� "abc"�� �ּҰ� str1�� ���� 
		String str2 = "abc"; //���ڿ� ���ͷ� "abc"�� �ּҰ� str�� ����
		String str3 = new String("abc"); //���ο� String �ν��Ͻ��� ���� 
		String str4 = new String("abc"); //���ο� String �ν��Ͻ��� ���� 
		
		
		
		if(str1==str2){
			System.out.println("str1 �� str2�� ����");
		} else {
			System.out.println("str1�� str2�� �ٸ���");
		}
		
		if(str3==str4){
			System.out.println("str3 �� str4�� ����");
			
		} else {
			System.out.println("str3�� str4�� �ٸ���");
		}	
		
		if(str1.equals(str2)){
			System.out.println("str1 �� str2�� ����");
		}else {
			System.out.println("str1�� str2�� �ٸ���");
		}

		if(str3.equals(str4)){
			System.out.println("str3 �� str4�� ����");
			
		} else {
			System.out.println("str3�� str4�� �ٸ���");
		}
		
		//���ڿ� ���ͷ�
		//���ڿ� ���ͷ��� ���α׷� ����� �ڵ����� �����ȴ� (constant pool�� ����)
		//���� ������ ���ڿ� ���ͷ��� �ϳ��� ��������� 
		String s1 = "AAA";
		String s2 = "AAA";
		String s3 = "AAA";
		String s4 = "AAA";
		
		//�� ���ڿ�("" ,empty String) 
		//������ ���� ���ڿ� ũ�Ⱑ 0�� cahr �迭�� �����ϴ� ���ڿ� 
		String str = ""; 
		
		//ũ�Ⱑ 0��  �迭�� ���ϴ� ���� ��� Ÿ���̳� ���� 
		char[]chArr = new char[0];//���̰� 0�� char�迭 
		int[] iArr = {}; //���̰� 0�� int �迭 
		
		
		
		
		
		
		
		
		
	}
}
