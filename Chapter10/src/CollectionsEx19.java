import java.util.TreeSet;

public class CollectionsEx19 {
	public static void main(String[]args){
		TreeSet set = new TreeSet();
		
		String from = "b"; 
		String to 	= "d";
		
		set.add("abc"); 	 set.add("alien"); 	 set.add("bat"); 
		set.add("car"); 	 set.add("Car");   	 set.add("disc"); 
		set.add("dance"); 	 set.add("dZZZZ");   set.add("dzzzz"); 
		set.add("elephant"); set.add("elevtor"); set.add("fan"); 
		
		System.out.println(set);
		System.out.println("Range search from " + from  + " to " + to);
		System.out.println("result1 :" + set.subSet(from, to));
		System.out.println("result2 :" + set.subSet("b", "e"));
		System.out.println("result3 :" + set.subSet(from, to + "zzz"));
	}
}
