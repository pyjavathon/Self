package sec02.exam01;

public class ByteExample {

	public static void main(String[] args) {
		//정수타입의 메모리 사용 크기 정도까진 암기
		//메모리 크기 모자란 경우 에러나는 예제
		
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		//byte var6 = 128; byte는 1byte(8bit)라 못 담음;
		
		System.out.println(var1+","+ var2+","+var3+","+var4+","+var5);

	}

}
