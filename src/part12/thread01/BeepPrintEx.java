package part12.thread01;

import java.awt.Toolkit;

public class BeepPrintEx {//메인스레드만 이용한 경우(스레드 클래스로부터 직접 생성)

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				
			}
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				
			}
		}
		
	}

}
