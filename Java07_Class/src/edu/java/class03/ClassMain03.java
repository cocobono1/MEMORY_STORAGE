package edu.java.class03;

public class ClassMain03 {

	public static void main(String[] args) {
		MyCircle Cir = new MyCircle();
		
		Cir.radius = 4.0;
		System.out.println("반지름 : " + Cir.radius);
		System.out.println("넓이 : " + Cir.calcArea());

	}// end main()

}// end ClassMain03
