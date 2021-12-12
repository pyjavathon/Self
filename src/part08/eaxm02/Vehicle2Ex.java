package part08.eaxm02;

public class Vehicle2Ex {

	public static void main(String[] args) {
		Vehicle2  vehicle2 = new Bus2();
		
		vehicle2.run();
		
		Bus2 bus2 = (Bus2) vehicle2;
		
		bus2.run();
		bus2.checkFare();
	}

}
