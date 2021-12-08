package sec02.exam01;

public class QStopExample {

	public static void main(String[] args) throws Exception{
		// while 반복문 나가기 break
		
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			if(keyCode == 113) {
				break;
			}
		}
		
		System.out.println("종료");

	}

}
