package part12.thread01;

public class BeepThreadEx {

	public static void main(String[] args) {//(Thread 하위 클래스로부터 생성)
		Thread thread = new BeepThread();
		thread.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500);} catch(Exception e) {}
		}

	}

}
