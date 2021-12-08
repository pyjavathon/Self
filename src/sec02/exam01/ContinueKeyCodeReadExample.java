package sec02.exam01;

public class ContinueKeyCodeReadExample {

	public static void main(String[] args) throws Exception{
		//while문 활용한 키코드 읽기

		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
		}
		
	}

}
