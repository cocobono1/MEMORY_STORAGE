package edu.java.if04;

import java.util.Scanner;

public class IfMain04 {

	public static void main(String[] args) {
		System.out.println("if - else if - else 연습");
		
		//점수를 정수로 입력받아서 score 이름의 변수에 저장
		//score가 90 점 이상이면 "A"를 출력
		//score가 80 점 이상이면 "B"를 출력
		//score가 70 점 이상이면 "C"를 출력
		//score가 70 점 미만이면 "F"를 출력
		System.out.println("점수 입력");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if(x >= 90) {
			System.out.println("A");
		}else if(x >= 80) {
			System.out.println("B");
		}else if(x >= 70) {
			System.out.println("C");
		}else {
			System.out.println("F");
		}
		
		sc.close();
	}//end main()

}//end IfMain04
