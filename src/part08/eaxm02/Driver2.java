package part08.eaxm02;

public class Driver2 {
	public void drive(Vehicle2 vehicle2) {
		if(vehicle2 instanceof Bus2) {
			Bus2 bus2 = (Bus2) vehicle2;
			bus2.checkFare();
		}
		vehicle2.run();
	}
}
