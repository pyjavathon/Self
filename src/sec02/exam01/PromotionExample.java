package sec02.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		//형변환.. 자동 타입 예제
		
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드: " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		
		

	}

}
