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
		//객체의 해시코드를 반환하는 메서드 
		//Object 클래스의 hashCode는 객체의 주소를 int 로 반환 
		//equals()를 오버라이딩 하면 hashCode()도 오버라이딩 해야 한다 
		//equals()의 결과가 true인 두 객체의 해시코드는 같아야 하기 때문이다 
		
		//Object class toString() 
		//객체를 문자열로 변환하기 위한 메서드 
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
