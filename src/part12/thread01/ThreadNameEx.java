package part12.thread01;

public class ThreadNameEx {//메인 스레드 이름 출력 및 UserThread 생성 및 시작

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("작업 스레드 이름: " + threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("작업 스레드 이름: " + threadB.getName());
		threadB.start();
	}
	
		
}
