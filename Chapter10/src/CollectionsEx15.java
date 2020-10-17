import java.util.HashSet;

public class CollectionsEx15 {
	public static void main(String[]args){
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setHab = new HashSet();
		HashSet setKyo = new HashSet();
	
	
		setA.add("1");
		setA.add("2");
		setA.add("3");
		setA.add("4");
		setA.add("5");
		
		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");
		setB.add("9");

		setA.removeAll(setB); 
		System.out.println("A - B " + setA);
		
		setA.retainAll(setB);
		System.out.println("A ¡û B " + setA);
		
		setA.addAll(setB); 
		System.out.println("A ¡ú  B " + setA);
	
		
	}
	
}
