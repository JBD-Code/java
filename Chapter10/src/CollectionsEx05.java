import java.util.Stack;

public class CollectionsEx05 {
	public static void main(String[]args){
		//Stack Ȱ���� �� 
		//���� ���, ���İ�ȣ ���, �������μ����� undo/redo 
		//�� �������� ������/�ڷ� 
		
		//Queue Ȱ���� �� 
		//�ֱ� ��빮��, �μ��۾� ��� ���, ����(buffer) 
		
		Stack st = new Stack();
		String expression = "((3+5)*8-2)";
		System.out.println("expression : " + expression );
		
		
		try {
			for(int i=0; i<expression.length(); i++){
				char ch = expression.charAt(i);
				if(ch=='('){
					st.push(ch+ "");
				}else if(ch ==')'){
					st.pop();
				}
			}
			
			if(st.isEmpty()){
				System.out.println("��ȣ�� ��ġ�մϴ�");
			}else {
				System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
