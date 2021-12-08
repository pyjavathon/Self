package sec02.exam01;

public class FloatDoubleExample {

	public static void main(String[] args) {
		//float과 double 타입 예제, 기본적으로 컴파일러는 실수 double타입으로 간주
		
		//float var1 = 3.12; 컴파일 에러남
		float var2 = 3.12f;
		double var3 = 3.12;
		
		//정밀도 테스트
		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789;
		
		System.out.println("var2:" + var2);
		System.out.println("var3:" + var3);
		System.out.println("var4:" + var4);
		System.out.println("var5:" + var5);//float타입보다 정밀한 값으로 출력됨
		
		//e 사용하기
		double var6 = 3e6;
		float var7 = 3e6f;
		double var8 = 2e-3;
		
		System.out.println("var6:" + var6);
		System.out.println("var7:" + var7);
		System.out.println("var8:" + var8);
	}

}
