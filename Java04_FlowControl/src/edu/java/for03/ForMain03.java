package edu.java.for03;

public class ForMain03 {

	public static void main(String[] args) {
		System.out.println("for문 연습");
		
		// 1 ~ 100까지 정수 주에서 10의 배수들만 출력
		for(int x = 1; x <= 100; x++) {
			if(x % 10 == 0) {
				System.out.print(x + " ");				
			}
		}
		System.out.println();
		
		// 1 2 3 .. 10
		// 11 12 13 .. 20
		// ~ 100
		for(int x = 1; x <= 100; x++) {
			System.out.print(x + " ");
			if(x % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		
	}//end main()

}//end ForMain03
