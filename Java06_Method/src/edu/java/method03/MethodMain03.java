package edu.java.method03;

import java.util.Scanner;

public class MethodMain03 {
	public static int sum(int kor, int eng, int mat) {
		return kor + eng + mat;
	}
	public static double avg(int kor, int eng, int mat) {
		return (kor + eng + mat)/3;
	}
	public static char selectGrade(double avg) {
		char result = 0;
		if(avg>=90) {
			result = 'A';
		}else if(avg>=80) {
			result = 'B';
		}else if(avg>=70) {
			result = 'C';
		}else {
			result = 'F';
		}
		return result;
	}

	public static void main(String[] args) {
		// 1. 국어, 영어, 수학 점수를 정수로 입력 받아서 3개의 변수에 저장
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수 입력>");
		int kor = sc.nextInt();
		System.out.println("영어점수 입력>");
		int eng = sc.nextInt();
		System.out.println("수학점수 입력>");
		int mat = sc.nextInt();
		// 2. 입력받은 점수를 출력
		System.out.println("국어 점수 : " + kor);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + mat);
		// 3. 메소드를 정의하여 세 과목의 총점을 출력
		 // 0 대신 메소드 호출
		int sum = sum(kor, eng, mat);
		System.out.println("총합 : " + sum);
		
		// 4. 메a소드를 정의하여 세 과목의 평균을 출력(소수점까지 출력)
		 // 0 대신 메소드 호출
		double avg = avg(kor, eng, mat);
		System.out.println("평균 : " + avg);
		
		// 5. 메소드를 정의하여 평균에 따른 등급을 출력
		// 예시)
		// 100 ~ 90 => 'A'
		// 89 ~ 80 => 'B'
		// 79 ~ 70 => 'C'
		// 69 미안 => 'F'
		char grade = selectGrade(avg); // 'F' 대신 메소드 호출
		System.out.println("등급 : " + grade);

	}//end main()

}//end MethodMain03
