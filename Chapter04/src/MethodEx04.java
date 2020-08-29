class Method04{
	
	void printGugudan(int dan){
		if(!(2<= dan && dan <=9)){
			return ;
		}
		for(int i=1; i<=9; i++){
			System.out.printf("%d * %d = %d%n", dan , i , dan*i);
		}
	}
}
public class MethodEx04 {
	public static void main(String[] args){
		
		Method04 method = new Method04(); 
		method.printGugudan(3);
		
	}
}
