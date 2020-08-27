class Method01{
	int num; 
	String name; 
	
	
	public void print99danAll(){
		for(int i=2; i<10; i++){
			for(int j=1; j<10; j++){
				System.out.println(i+ "*"+j + "="+i*j);
			}
			System.out.println("");
		}
	}
	public int add(int x, int y){
		return x+y; 
	}
	public int sub(int x, int y){
		return  x-y; 
	}
	public int mul(int x, int y){
		return x*y;
	}
	public float div(float x, float y){
		return x/y; 
	}
	
}

public class MethodEx02 {
	public static void main(String[] args){
		//Method의 호출 
		//Method의 이름 (값1, 값2...); 
		
		Method01 m = new Method01(); 
		m.print99danAll();
		int sub = m.sub(3, 4);
		int add = m.add(3, 4);
		int mul = m.mul(3, 4);
		float div = m.div(3, 4);
		System.out.println(sub);
		System.out.println(add);
		System.out.println(mul);
		System.out.println(div);
	}
}
