
public class ArrayEx07 {
	public static void main(String[]args){
		//2���� �迭 
		//���̺� ������ �����͸� �����ϱ� ���� �迭 
		int[][] score = new int[4][3];
		
		//2���� �迭�� �ε��� 
		//int[][] score = new int[4][3];
		//score[0][0] score[0][1] score[0][2] 
		//score[1][0] score[1][1] score[1][2] 
		//score[2][0] score[2][1] score[2][2] 
		//score[3][0] score[3][1] score[3][2] 
		score[0][0] = 100; 
		System.out.println(score[0][0]);
		
		//2���� �迭�� �ʱ�ȭ 
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
