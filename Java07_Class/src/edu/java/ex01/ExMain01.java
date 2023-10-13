package edu.java.ex01;

public class ExMain01 {

	public static void main(String[] args) {
		
		ex01 memberService = new ex01();
		boolean result = memberService.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}

	}// end main()

}// end ExMain01
