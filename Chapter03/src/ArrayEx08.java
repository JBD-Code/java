
public class ArrayEx08 {
	public static void main(String[]args){
		
		int[][] score = {
							{100, 98, 90},
							{89, 78, 90},
							{70, 68, 99},
							{100, 100, 50}
						};
		
		int korTotal = 0; 
		int	engTotal = 0; 
		int	mathTotal = 0; 
		
		System.out.println("��ȣ    ����      ����     ����     ����     ���"); 
		System.out.println("=============================");
		
		for(int i=0; i<score.length; i++){
			
			int sum = 0;
			float avg = 0.0f; 
			
			korTotal+=score[i][0];
			mathTotal+=score[i][1];
			engTotal+=score[i][2];
			
			System.out.printf("%3d",i+1);

			for(int j=0; j<score[i].length; j++){
				sum +=score[i][j];
				
				System.out.printf("%5d", score[i][j]);
				
			}
			avg = sum/(float)score[i].length;
			System.out.printf("%5d %5.1f%n", sum, avg);
		}
		System.out.println("=============================");
		System.out.printf("���� : %3d %4d %4d%n", korTotal, engTotal, mathTotal);

	
	}
}
