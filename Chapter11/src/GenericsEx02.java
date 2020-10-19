import java.util.ArrayList;
class Tv {}
class Audio{}
public class GenericsEx02 {
	public static void main(String[]args){
		//타입 변수 
		//클래스를 작성할 때 Object 타입 대신 타입 변수(E)를 선언해서 사용 
		//객체 생성시 타입변수 (E) 대신 실제 타입 (Tv)을 지정(대입) 
		
		//ArrayList list = new ArrayList(); 
		//list.add(new Tv());
		//list.add(new Audio());
	
		
		ArrayList<Tv>list = new ArrayList<Tv>();
		list.add(new Tv());
		//list.add(new Audio());
		//Tv t = (Tv)list.get(0);
		Tv t = list.get(0);
		
	}
}
