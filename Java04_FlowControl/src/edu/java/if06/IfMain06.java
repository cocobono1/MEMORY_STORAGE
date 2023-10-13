package edu.java.if06;

import java.util.Scanner;

public class IfMain06 {

	public static void main(String[] args) {
		System.out.println("if 중첩문");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		sc.close();
		
		// 입력된 num 값이 짝수인 경우 "짝수"출력
		// 입력된 num 값이 홀수인 경우 "홀수"출력
		// 입력된 num 값이 짝수이면서, 4의 배수이면 "4의 배수" 출력
		// 입력된 num 값이 짝우시면서, 4의 배수가 아니면 "4의 배수가 아닌 짝수" 출력
		if(num % 2 == 0) {
			System.out.println("짝수");
			if(num % 4 ==0 ) {
				System.out.println("4의 배수");
			}else {
				System.out.println("4의 배수가 아닌 짝수");
			}
		}else {
			System.out.println("홀수");
		}
	}//end main()

}//end IfMain06
