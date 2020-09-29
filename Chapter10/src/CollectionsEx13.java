import java.util.HashSet;
import java.util.Objects;

public class CollectionsEx13 {
	public static void main(String[]args){
		//HashSet�� ��ü�� �����ϱ� ���� ������ ���� ��ü�� �ִ��� Ȯ���Ѵ� 
		//���� ��ü�� ������ �������� �ʰ�, ���� ��ü�� ������ �����Ѵ� 
		//boolean add(Object o)�� ������ ��ü�� equals()�� hashCode()�� ȣ�� 
		
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
