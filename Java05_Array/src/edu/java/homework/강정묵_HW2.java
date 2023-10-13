package edu.java.homework;

public class 강정묵_HW2 {

	public static void main(String[] args) {
//과제1. 배열 6 8 4 2 5의 값 중에 최대값 출력하기 
		int[] arr = { 6, 8, 4, 2, 5 };
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("최대값 =" + max);
//과제2. 배열 6 8 4 2 5의 전체 합과 평균 값을 구하기
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		double avg = ((double) sum) / 5;
		System.out.println("평균 = " + avg);
		System.out.println();

//과제3. 피보나치 수열 20개를 출력
//	    피보나치(Fibonacci)수열 : 1, 1, 2, 3, 5, 8, 13, 21, ....
//		힌트)
//		f[0] = 1
//		f[1] = 1
//		f[n] = f[n-1] + f[n-2], n >=2
//		1) 정수 20개를 저장할 수 있는 배열선언
		int[] arry = new int[20];
//		2) 배열의 인덱스 0번째, 1번째 원소는 1로 초기화
		arry[0] = 1;
		arry[1] = 1;
//		3) 배열의 인덱스 2번째 원소부터 19번째 원소까지 반복문을 사용해서 초기화
		for (int i = 2; i < 20; i++) {
			arry[i] = arry[i - 1] + arry[i - 2];
//		4) 배열의 내용을 출력
			System.out.print(arry[i] + " ");
		}
		System.out.println();

//과제4. int[][]arry = {
//		{95, 86},
//		{44, 22, 96},
//		{78, 83, 93, 87, 88}
//	}
//		위 2차원 배열의 전체 합과 평균과 최대값 구하기
		int tot = 0;
		int cnt = 0;
		int[][]arry1 = {
				{95, 86},
				{44, 22, 96},
				{78, 83, 93, 87, 88}		
		};
		for(int i = 0; i < arry1.length; i++) {
			for(int j =0; j < arry1[i].length; j++) {
				tot = tot + arry1[i][j];
				cnt = cnt + arry1[i].length; 
			}
		}
		System.out.println("총합 = " + tot);
		System.out.println("평균 = " + tot/cnt);

	}
}