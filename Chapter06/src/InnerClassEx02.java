
public class InnerClassEx02  {
	class InstanceInner{
		int iv =100; 
		//static int cv = 100; Error static ���� ���� �Ұ� 
		final static int CONST =100; //final static�� ����̹Ƿ� ���� 
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv = 300; //static Ŭ�����̹Ƿ� static ����� ���� ���� 
		
	}
	void method(){
		class LocalInner{
			int iv = 300; 
			//static int cv = 400; Error static ���� ���� �Ұ�  
			final static int CONST = 500; //final static�� ����̹Ƿ� ����
		}
	}

	public static void main(String[]args){
		//Inner class�� �����ڿ� ���ټ� 
		//private, default, protected, public ��� ���� 
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
		//System.out.println(LocalInner.CONST);
	}
}
