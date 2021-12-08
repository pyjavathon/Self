package sec02.exam01;

public class ByteOperationExample {

	public static void main(String[] args) {
	/*
	 * byte,short의 경우 변수가 피연산자로 사용되면 int로 자동변환됨. 
	 * 그러나 정수 리터럴의 경우는 해당 안됨 ex) byte result = 10+20;
	 */
		
		byte result1 = 10 + 20;
		System.out.println(result1);
		
		byte x = 10;
		byte y = 20;
		int result2 = x + y;
		System.out.println(result2);

	}

}
