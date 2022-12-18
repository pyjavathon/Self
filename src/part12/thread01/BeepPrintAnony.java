package part12.thread01;

import java.awt.Toolkit;

public class BeepPrintAnony {//Runnable 익명 구현 객체 이용(스레드 클래스로부터 직접 생성)

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch(Exception e) {}
				}
			}
		});
		thread.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}

}
