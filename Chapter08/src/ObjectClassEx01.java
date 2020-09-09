
public class ObjectClassEx01 {
	public static void main(String[]args){
		//Object class 
		//��� Ŭ������ �ְ� ���� 11 ���� method �� ������ �ִ� 
		//notify(), wait() ���� thread�� ���õ� method
		
		//Object ���� method 
		//protected Objectt clone() 			��ü �ڽ��� ���纻�� ��ȯ 
		//public boolean equals(Object obj)		��ü �ڽŰ� ��ü obj�� ���� ��ü���� �˷��ش� 
		//protected void finalize()				��ü�� �Ҹ��� �� ������ �÷��Ϳ� ���� �ڵ������� ȣ��ȴ� �� �� ����Ǿ�� �ϴ�
		//										�ڵ尡 ���� �� �������̵��Ѵ� 
		//public Class getclass					��ü �ڽ��� Ŭ���� ����(���赵 ����)�� ��� �ִ� class �ν��Ͻ��� ��ȯ�Ѵ� 

		//public int hashCode()					��ü �ڽ��� �ؽ��ڵ带 ��ȯ�Ѵ� 
		//public String toString()				��ü �ڽ��� ������ ���ڿ��� ��ȯ�Ѵ� 

		//public void notify()					��ü �ڽ��� ����Ϸ��� ��ٸ��� �����带  �ϳ��� ����� 
		//public void nofifyAll()				��ü �ڽ��� ����Ϸ��� ��ٸ��� ��� �����带 ����� 
		//public void wait()					�ٸ� �����尡 notify(), notifyAll()�� ȣ���� �� ���� ���� ������� ������ �Ǵ� ������ �ð�
		//public void wait(long timeout)		(timeout, nanos)���� ��ٸ��� �Ѵ� (timeout�� õ���� 1��, nanos�� 10������ 1��)
		//public void wait(long timeout, nanos) 	
	
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2)){
			System.out.println("v1 �� v2�� �����ϴ� ");
		}else {
			System.out.println("v1 �� v2�� �ٸ��ϴ�  ");
		}
	}
}

class Value {
	int value; 
	
	Value(int value){
		this.value = value;
	}
	public boolean equals(Object obj){
		if(!(obj instanceof Value))return false;
		Value v = (Value)obj;
		return this.value == v.value;
	}
}
