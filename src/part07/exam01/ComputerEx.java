package part07.exam01;

public class ComputerEx {

	public static void main(String[] args) {

		int r = 10;
		
		Cal calculator = new Cal();
		System.out.println("원면적: " + calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("원면적 : "+ computer.areaCircle(r));
		
	}

}
