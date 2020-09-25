import java.util.Stack;

public class CollectionsEx05 {
	public static void main(String[]args){
		//Stack 활용의 예 
		//수식 계산, 수식괄호 계산, 워드프로세서의 undo/redo 
		//웹 브라우저의 앞으로/뒤로 
		
		//Queue 활용의 예 
		//최근 사용문서, 인쇄작업 대기 목록, 버퍼(buffer) 
		
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
				System.out.println("괄호가 일치합니다");
			}else {
				System.out.println("괄호가 일치하지 않습니다");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
