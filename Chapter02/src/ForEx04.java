
public class ForEx04 {
	public static void main(String[]args){
		//이름 붙은 반복문 
		//반목문에 이름을 붙여 하나 이상의 반복문을 벗어날 수 있다
		//for문 앞에 Loop1 이라는 이름을 붙인다 
		
		Loop1 : for(int  i=2; i<=9; i++){
				for(int j=1; j<=9; j++){
					if(j==5)
						break Loop1;
						//break;
						//continue Loop1; 
						//continue;
					System.out.println(i+" *" +j + "=" +i*j);
				}
				System.out.println();
		}
	}
}
