import java.util.Arrays;

public class ArrayEx01 {
	public static void main(String[]args){
		//Array 

		//�迭�� ����� ���� 

		//Ÿ�� [] �����̸� // �迭�� ���� (�迭�� �ٷ�� ���� ���� ���� ����)
		//�����̸� = new Ÿ��[����] //�迭�� ���� (���� ������ ����) 
		//int[] score;
		//score =new int[5];
		
		int [] score ; 		//1. �迭 score�� ���� (��������) 
		score =new int[5];  //2. �迭�� ���� 
		score[3] =100; 
		System.out.println("score[3]="+score[3]);
		System.out.println("score[0]="+score[0]);
		System.out.println("score[1]="+score[1]);
		System.out.println("score[2]="+score[2]);
		System.out.println("score[4]="+score[4]);
		
		
		//�迭�� ���� 
		//�����̸�.length - ������ ����(int�� ���)
		//�迭�� �ѹ� �����Գ� �� ���̸� �ٲ� �� ���� 
		
		int []arr =new int[10]; //���̰� 5�� int �迭 
		int tmp = arr.length;  
		
		for(int i=0; i<arr.length; i++){
			System.out.println("arr["+i+"]=" +arr[i]);
		}
		
		//������ �ʱ�ȭ 
		//������ �� ��ҿ� ó������ ���� �����ϴ� �� 
		int []score01 = new int[5];
		score[0] =50;
		score[1] =60;
		score[2] =70;
		score[3] =80;
		score[4] =90;
		
		int[] score02 = {50, 60, 70, 80, 90}; 
		
		//������ ��� 
		
		int[]iArr = {100, 90, 85, 75, 70};
		int[]iArr1 = new int[10];
		int[]iArr2 = new int[10];
		char[] chArr = {'a', 'b', 'c', 'd'};

		for(int i=0; i<iArr1.length; i++){
			iArr1[i] =i+1;
		}
		for(int i=0; i<iArr1.length; i++){
			System.out.println(iArr1[i]);
		}
		
		System.out.println(Arrays.toString(iArr1));
		System.out.println(iArr1);
		System.out.println(chArr);
		
		for(int i=0; i<iArr.length; i++){
			System.out.println("iArr["+ i+"]="+iArr[i]);
		}
		
		System.out.println(Arrays.toString(iArr));
		
		
	}
}
