import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CollectionsEx06 {
	
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; 
	public static void main(String[]args){
		System.out.println("help�� �Է��ϸ� ������ �� �� �ֽ��ϴ�");
		
		while(true){
			System.out.println(">>");
			
			try {
				Scanner scan = new Scanner(System.in);
				String input = scan.nextLine().trim();
				
				if("".equals(input)) continue;
				
				if(input.equalsIgnoreCase("q")){
					System.exit(0);	
				}else if(input.equalsIgnoreCase("help")) {
					System.out.println("help - ������� �����ݴϴ�");
					System.out.println("q �Ǵ� Q - ���α׷��� �����մϴ�  ");
					System.out.println("history - �ֱ� �Է��� ��ɾ "+MAX_SIZE+"�� �����ݴ� ");
				}else if(input.equalsIgnoreCase("history")){
					
					save(input);
				
					LinkedList list  = (LinkedList)q; 
					
					for(int i=0; i<list.size(); i++){
						System.out.println((i+1)+"."+list.get(i));
					}
				}else {
					save(input);
					System.out.println(input);
				}
			
			
			} catch (Exception e) {
				// TODkO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	public static void save(String input){
		if(!"".equals(input))
			q.offer(input);
		
		if(q.size() >MAX_SIZE)
			q.remove();
	}
}
