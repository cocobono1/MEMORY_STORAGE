package edu.java.score;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		System.out.println("학생 수를 입력하세요");
		int stu = sc.nextInt();
		Integer[] arr = new Integer[stu];
		while(run) {
			System.out.println("========================================");
			System.out.println("1. 점수입력 | 2. 점수리스트 | 3. 분석 | 4. 종료 ");
			System.out.println("========================================");
			System.out.println("선택>");
			
			int choice = sc.nextInt();
			switch (choice) {
			case 1 :
				System.out.println("점수를 입력하세요");
				for(int i = 0; i < arr.length; i++) {
					System.out.println("["+ i +"]학생의 점수 입력>");
					arr[i] = sc.nextInt();
				}
				break;
			
			case 2 :
				for(int i = 0; i < arr.length; i++) {
					System.out.println("[" + i + "]번 학생의 점수" + arr[i]);
				}
				break;
				
			case 3 :
				for(int i = 0; i < arr.length; i++) {
					Arrays.sort(arr, Collections.reverseOrder());
					System.out.println((i+1) + "등 :" + arr[i]);
				}
				break;
				
			case 4 :
				System.out.println("종료합니다.");
				run = false;
				break;

			default:
				System.out.println("올바른 메뉴를 선택하세요.");
				break;
				
			}
		}

	}//end main()

}//end Main
