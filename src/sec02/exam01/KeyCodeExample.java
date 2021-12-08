package sec02.exam01;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception{
		//입력된 키코드를 변수에 저장

		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
	}

}
