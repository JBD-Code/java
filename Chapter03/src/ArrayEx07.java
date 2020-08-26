
public class ArrayEx07 {
	public static void main(String[]args){
		//2차원 배열 
		//테이블 형태의 데이터를 저장하기 위한 배열 
		int[][] score = new int[4][3];
		
		//2차원 배열의 인덱스 
		//int[][] score = new int[4][3];
		//score[0][0] score[0][1] score[0][2] 
		//score[1][0] score[1][1] score[1][2] 
		//score[2][0] score[2][1] score[2][2] 
		//score[3][0] score[3][1] score[3][2] 
		score[0][0] = 100; 
		System.out.println(score[0][0]);
		
		//2차원 배열의 초기화 
		int[][]arr = new int[][]{{1,2,3}, {4,5,6}};
		int[][]arr01 =  {
							{1 ,2, 3}, 
							{4, 5, 6}
						};
		int[][]score01 = { 
							{100, 100, 100},
							{20, 20, 20},
							{30, 30, 30},
							{40, 40, 40}
						 };
		int sum = 0; 
		
		for(int i=0; i<score01.length; i++){
			for(int j=0; j<score01[i].length; j++){
				System.out.printf("score01[%d][%d]=%d%n", i, j, score01[i][j]);
				sum+=score01[i][j];
			}
		}
		
		System.out.println(sum);
	
		
	}
}
