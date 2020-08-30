class Method10{
	
	int add(int a, int b){
		System.out.print("int add(int a, int b) - ");
		return a+b; 
	}
	
	long add(long a, long b){
		
		System.out.print("long add(long a, long b) - ");
		return a+b;
	}
	
	long add(int a, long b){
		
		System.out.print("long add(int a, long b) - ");
		return a+b;
	}

	long add(long a, int b){
			
			System.out.print("long add(long a, int b) - ");
			return a+b;
		}

	int add(int[] a){
		System.out.print("int add(int [] a) - ");
		int result = 0;
		
		for(int i=0; i<a.length; i++){
			result += a[i];
		}
		
		return result ;
		
	}
}


public class MethodEx10 {
	public static void main(String[]args){
		
		Method10 mm = new Method10(); 
		
		System.out.println("mm.add(4,5) result :" + mm.add(4, 5));
		System.out.println("mm.add(4,5) result :" + mm.add(4L, 5L));
		System.out.println("mm.add(4L,5) result :" + mm.add(4L, 5));
		System.out.println("mm.add(4,5L) result :" + mm.add(5, 5L));
		
		
		int [] a = {100, 200, 300, 400}; 
		
		System.out.println("mm.add(a) result :" +mm.add(a));
	}
}
