package part6.exam03;

public class StaticExMain {

	public static void main(String[] args) {
		double result1 = 10 * 10 * StaticEx.pi;
		
		int result2 = StaticEx.plus(10, 5);
		
		int result3 = StaticEx.minus(10, 5);
		
		System.out.println("result1 : " + result1 + "\n" + "result2 :" + result2 +
				"\nresult3 : " + result3 );
	}

}
