package part07.exam02;

public class DrivaerEx {

	public static void main(String[] args) {

		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(taxi);
		driver.drive(bus);
	}

}
