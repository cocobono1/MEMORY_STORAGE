package edu.java.inner02;

public class InnerMain02 {

	public static void main(String[] args) {
		Car car1 = new Car("Bugatti La Voiture Noire");
		Car.Tire tire = car1.new Tire(20);
		tire.display();
		
		System.out.println();
		Car car2 = new Car("제네시스");
		Car.Tire tire2 = car2.new Tire(15);
		tire2.display();
	}// end main()

}// end InnerMain02
