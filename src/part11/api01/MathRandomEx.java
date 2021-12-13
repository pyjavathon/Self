package part11.api01;

public class MathRandomEx {//임의의 주사위의 눈 얻기

	public static void main(String[] args) {
		int num = (int) (Math.random()*6) + 1;
		System.out.println("주사위 눈: " + num);

	}

}
