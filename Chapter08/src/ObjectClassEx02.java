class Person{
	long id; 
	
	
	public boolean equals(Object obj){
		if(!(obj instanceof Person))
			return false;
		
		Person p = (Person)obj;
		
		return this.id == p.id; 
	}
	
	Person(long id ){
		this.id = id; 
	}
}


public class ObjectClassEx02 {
	public static void main(String[]args){
		Person p1 = new Person(811108111222L);
		Person p2 = new Person(811108111222L);
		
		
		if(p1.equals(p2)){
			System.out.println("p1�� p2�� ���� ����Դϴ�");
		}else {
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�");
		}
	}
}
