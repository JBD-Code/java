import java.util.ArrayList;
class Tv {}
class Audio{}
public class GenericsEx02 {
	public static void main(String[]args){
		//Ÿ�� ���� 
		//Ŭ������ �ۼ��� �� Object Ÿ�� ��� Ÿ�� ����(E)�� �����ؼ� ��� 
		//��ü ������ Ÿ�Ժ��� (E) ��� ���� Ÿ�� (Tv)�� ����(����) 
		
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
