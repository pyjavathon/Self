package part08.eaxm02;

public class CarEx {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.run();
		
		car.frontLeftTire = new KumhoTire();
		car.frontRightTire = new KumhoTire();
		
		car.run();
	}

}
