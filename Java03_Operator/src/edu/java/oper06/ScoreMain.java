package edu.java.oper06;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {
		System.out.println("총점 및 평균 계산 프로그램");
		
		//1. 입력받을 준비 : Scanner 생성
		
		//2. 국어, 영어, 수학 점수를 정수로 입력받아서 각 병수에 저장
		//   - 병수 3개 직접 생성
		//3. 국어, 영어, 수학 점수를 출력
		//4. 총점을 계산하여 출력
		//5. 평균을 계산하여 출력(소수점 셋째자리까지)
		
		//Scanner num1 = new Scanner(System.in);
		//System.out.println("국어점수입력 :");
		//int kor = num1.nextInt();
		//System.out.println("국어점수 :" + kor);
		
		//Scanner num2 = new Scanner(System.in);
		//System.out.println("영어점수입력 :");
		//int eng = num2.nextInt();
		//System.out.println("영어점수 :" + eng);
		
		//Scanner num3 = new Scanner(System.in);
		//System.out.println("수학점수입력 :");
		//int mat = num3.nextInt();
		//System.out.println("수학점수 :" + mat);
		
		//int total = kor + eng + mat ;
		//System.out.println("총점 :" + (total));
		//System.out.printf("평균 : %.3f" , (total/3.0));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수 입력 : ");
		int kor = sc.nextInt();
		System.out.println("영어 점수 입력 : ");
		int eng = sc.nextInt();
		System.out.println("수학 점수 입력 : ");
		int math = sc.nextInt();
		
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		
		int sum = kor + eng + math;
		System.out.println("총점 : " + sum);
		
		double average = sum / 3.0;
		System.out.printf("평균 : %.3f", average);

	}// end main()

}// end ScoreMain
