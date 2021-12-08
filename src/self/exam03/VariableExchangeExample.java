package self.exam03;

public class VariableExchangeExample {

	public static void main(String[] args) {
		//변수의 값을 교환하는 방법 예제 *두변수의 값을 교환하기 위해 새로운 변수 temp를 선언한 것에 주목
		
		int x = 3;
		
		int y = 5;
		
		System.out.println("x" + x +", y:" + y);
		
		int temp = x;
		
		x = y;
		
		y = temp;
		
		System.out.println("x:" + x + ",y:" + y);
		

	}

}
