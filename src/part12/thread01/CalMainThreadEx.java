package part12.thread01;

public class CalMainThreadEx {

	public static void main(String[] args) {
		Calculator calculaotr = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculaotr);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calculaotr);
		user2.start();
		
	}

}
