package part04.exam01;

public class JusawuiExample {

	public static void main(String[] args) {
		//break로 while문 종료

		while(true) {
			int num = (int)(Math.random() * 6)+1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
