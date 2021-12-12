package part6.exam;

public class CalculatorEx {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		
		cal.powerOn();
		System.out.println();
		
		int result1 = cal.plus(5, 9);
		System.out.println("result1: " + result1);
		System.out.println();
		
		double result2 = cal.divide(9, 3);
		System.out.println("result2 : " + result2);
		System.out.println();
		
		
		
	}

}
