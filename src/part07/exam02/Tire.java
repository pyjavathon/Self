package part07.exam02;

public class Tire {

	//field
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//method
	public boolean roll() {
		++accumulatedRotation;//누적 회전수 1 증가
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire 수명: " +
		(maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "Tire 펑크 ***");
			return false;
		}
	}
}
