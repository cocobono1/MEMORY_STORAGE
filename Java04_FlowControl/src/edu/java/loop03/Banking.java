package edu.java.loop03;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		System.out.println("JAVA 은행");

		Scanner sc = new Scanner(System.in);
		boolean run = true; // while문 종료 여부
		int balance = 0; // 잔금 저장 변수

		while (run) {
			System.out.println("--------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("--------------------------------");
			System.out.println("선택>");

			int choice = sc.nextInt(); // 선택된 값을 저장할 변수
			 
			switch (choice) {
			case 1:
				System.out.println("예금액>");
				int money = sc.nextInt();
				balance += money;
				break;
			
			case 2:
				System.out.println("출금액>");
				money = sc.nextInt();
				balance -= money;
				break;
			
			case 3:
				System.out.println("잔고 : " + balance);
				break;
			
			case 4:
				System.out.println("종료합니다.");
				run = false;
				break;

			default:
				System.out.println("올바른 메뉴를 선택하세요.");
				break;
			}
		}

	}// end main

}// end Banking
