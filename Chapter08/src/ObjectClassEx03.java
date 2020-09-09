import java.util.Objects;

class Card{
	String kind; 
	int number; 
	
	Card(){
		this("SPADE", 1);
	}
	Card(String kind, int number){
		this.kind = kind; 
		this.number = number; 
	}
	public String toString(){
		return "kind : " + kind +", number : " + number;
	
	}
	public int hashCode(){
		return Objects.hash(kind, number);
	}
	
	public boolean equals(Object obj){
		if(!(obj instanceof Card)) return false ; 
		
		Card c = (Card)obj;
		return this.kind.equals(c.kind) && this.number==(c.number); 
	}
}

public class ObjectClassEx03 {
	public static void main(String []args){
		//Object class hashCode()
		//��ü�� �ؽ��ڵ带 ��ȯ�ϴ� �޼��� 
		//Object Ŭ������ hashCode�� ��ü�� �ּҸ� int �� ��ȯ 
		//equals()�� �������̵� �ϸ� hashCode()�� �������̵� �ؾ� �Ѵ� 
		//equals()�� ����� true�� �� ��ü�� �ؽ��ڵ�� ���ƾ� �ϱ� �����̴� 
		
		//Object class toString() 
		//��ü�� ���ڿ��� ��ȯ�ϱ� ���� �޼��� 
		Card c1 = new Card();
		Card c2 = new Card();
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(new Card().toString());
		System.out.println(new Card().toString());
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
	}
}
