package sec02.exam01;

public class LongExample {

	public static void main(String[] args) {
		//long 타입 사용 예제
		
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 100000000000; 컴파일 에러
		//기본적으로 컴파일러는 정수 리터럴을 int 타입으로 간주, 그래서 정수 리터럴이  
		//int 타입의 허용범위를 초과하면 long타입임을 표시해서 알려야함.
		long var4 = 100000000000L;
	
		System.out.println(var1);
		
		System.out.println(var2);
		
		System.out.println(var4);
	
	}

}
