class Method {
	static void printArr(int[] numArr){
		for(int i=0; i<10; i++){
			System.out.printf("numArr[%d]=%d%n",i, numArr[i]);
		}
	}
}
public class MethodEx01 {
	public static void main(String[]args){
		//Method 
		//������ ���� �� 
		//��(�Է�)�� �޾Ƽ� ó���ϰ� , ����� ��ȯ(���) 
		
		//Method�� ����
		//�ڵ��� �ߺ��� ���δ� 
		//�ڵ��� ������ ����
		//�ڵ� ������ �����ϴ� 
		//�ڵ尡 �����ؼ� �����ϱ� �������� 
		int [] numArr = new int[10];
		
		for(int i=0; i<10; i++){
			numArr[i] = (int)(Math.random()*10);
		}
		
		for(int i=0; i<10; i++){
			System.out.printf("%d%n", numArr[i]);
		}
		
		for(int i=0; i<10; i++){
			System.out.printf("%d%n", numArr[i]);
		}
		
		Method m = new Method(); 
		m.printArr(numArr);
		
		//�ݺ������� ����Ǵ� ���������� �޼���� �ۼ� 
		//�ϳ��� �޼���� �ϳ��� ��ɸ� �����ϵ��� �ۼ�
		//�޼��� = ����� + ������ 
		/*
		 ��ȯŸ�� �޼��� �̸� (Ÿ�� ������, Ÿ�� ������ ) - ����� { 
				- ������ 
		} 
			
		int add(int a, int b ) - ����� {
		
			int result = a + b; ������  
			return result 
		
		}	
		
		*/
	
	}
}
