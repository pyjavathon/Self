package part6.exam02;

public class CalEx {

	public static void main(String[] args) {

		Cal cal = new Cal();

		double result1 = cal.areaRectangle(10);
		
		double result2 = cal.areaRectangle(10, 20);
		
		System.out.println("정사각형 넓이 = " + result1 +"\n" +"직사각형 넓이 = " + result2);
	}

}
