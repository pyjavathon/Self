package part12.thread01;

import java.awt.Toolkit;

public class BeepTask implements Runnable {//(스레드 클래스로부터 직접 생성)
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				
			}
		}
	}

}
