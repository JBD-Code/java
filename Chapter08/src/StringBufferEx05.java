
public class StringBufferEx05 {
	public static void main(String[]args){
		//StringBuilder 
		//StringBuffer는 동기화 되어 있다. 멀티쓰레드에 안전(thread-safe)
		//멀티쓰레드가 아닌 경우 동기화는 불필요한 성능을 저하시킨다 
		//싱글쓰레드에는 StringBuffer대신 StringBuilder를 사용하면 성능을 향상 시킨다 
		
		//Single Thread
		StringBuilder sb; 
		sb = new StringBuilder();
		sb.append("abc");
		System.out.println(sb);
		
		//Multi Thread 
		//StringBuilder sb; 
		//sb = new StringBuilder();
		//sb.append("abc");
		//System.out.println(sb);
		
	}
}
