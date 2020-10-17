import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsEx17 {
	public static void main(String[]args){
		//TreeSet
		
		Set set = new TreeSet();//범위 검색, 정렬이 필요 없디 
		//Set set = new HashSet(); //정렬이 필요 
		for(int i =0; set.size()<6; i++){
			int num = (int)(Math.random()*45)+1; 
			set.add(num);
		}
		System.out.println(set);
		
	}
}
