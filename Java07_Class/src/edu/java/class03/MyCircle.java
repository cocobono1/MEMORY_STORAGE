package edu.java.class03;

public class MyCircle {
	// 멤버 변수 : double radius
	double radius;
	
	// 생성자: 기본 생성자
	public MyCircle() {};
	
	// 매개변수(double radius)가 있는 생성자
	public MyCircle(double radius) {
		this.radius = radius;
	}
	
	// 메소드 : 원의 면적을 계산 (3.14*radius*radius)
	
	public double calcArea() {
		return 3.14 * radius * radius;
	}

}// end MyCircle
