import java.util.HashSet;
import java.util.Objects;

public class CollectionsEx13 {
	public static void main(String[]args){
		//HashSet은 객체를 저장하기 전에 기존에 같은 객체가 있는지 확인한다 
		//같은 객체가 있으면 저장하지 않고, 같은 객체가 없음녀 저장한다 
		//boolean add(Object o)는 저장할 객체의 equals()와 hashCode()를 호출 
		
		HashSet set = new HashSet();
		set.add("abc");
		set.add("abc");
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		
		System.out.println(set);
	}
}


class Person{
	String name; 
	
	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Person)) return false; 
		Person p = (Person) obj;
		
		return this.name.equals(p.name) && this.age==p.age;
	}
	int age; 
	
	
	Person(String name, int age){
		this.name= name; 
		this.age =age; 
	}
	public String toString(){
		return name + ":" +age;
	}
}
