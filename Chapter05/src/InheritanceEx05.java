import java.io.IOException;
import java.sql.SQLException;

class Parent{
	void parentMethod() throws IOException, SQLException {
	 	
	}
}
class Child extends Parent{
	void parentMethod() throws IOException { //overloading 
		
	}
	void parentMethod(int i) { //overriding 
		
	}
	void childMethod() { //a ����
		
	}
	void childMethod(int i) { //overloading 
		
	}	
	
}

public class InheritanceEx05 {
	public static void main(String[]args){
		//Overriding�� ���� 
		  
		//����ΰ� ���� Ŭ������ �޼���� ��ġ�ؾ� �Ѵ� 
		//���������ڰ� ���� Ŭ������ �޼��� ���� ���� ������ ������ �Ұ��� �ϴ� 
		//���ܴ� ���� Ŭ������ �޼��� ���� ���� ���� �� �� ���� 
	}
}
