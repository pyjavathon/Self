package part12.thread01;

import java.awt.Toolkit;

public class BeepThread extends Thread{//비프음을 들려주는 스레드(Thread 하위 클래스로부터 생성)
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			try { Thread.sleep(500);} catch(Exception e) {}
		}
	}
}
