class Method08_1{ 
	void instanceMethod(){}
	static void staticMethod(){}

	void instanceMethod02(){
		instanceMethod();
		staticMethod();
	}
	static void staticMethod2(){
		//instanceMethod();
		staticMethod();
	}

}



class Method08{
	int iv; 
	static int cv; 
	
	void instanceMethod(){
		System.out.println(iv);
		System.out.println(cv);
	}
	static void staticMethod(){
		System.out.println(cv);
		
	}
}


public class MethodEx08 {
	public static void main(String[]args){
		Method08 mm = new Method08(); 
		mm.iv=3; 
		mm.instanceMethod();
		
		Method08.cv=43; 
		Method08.staticMethod();
	}
}
