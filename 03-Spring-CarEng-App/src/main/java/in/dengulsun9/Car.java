package in.dengulsun9;

public class Car {

	private IEngine eng;

	public Car() {
		// TODO Auto-generated constructor stub
		// System.out.println("Car:Constructor");
	}

	public void setEng(IEngine eng) {
		System.out.println("Car:Setter");
		this.eng = eng;
	}

	public void drive() {
		int status = eng.start();
		if (status >= 1) {
			System.out.println("Journey Started");

		} else {
			System.out.println("Engine Troubled");
		}
	}
}
