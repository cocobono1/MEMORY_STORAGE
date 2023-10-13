package edu.java.inherit05;

public class Point {
	// 멤버 변수 (double x, double y)
	private double x;
	private double y;
	// 기본 생성자
	public Point() {}
	// 매개변수 생성자
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	

	@Override
	public String toString() {
		return "("+ x + "," + y +")";
	}
	
	
	
}
