package part07.exam03;

public class PhoneEx {

	public static void main(String[] args) {
		//Phone phone = new Phone();
		SmartPhone smart = new SmartPhone("홍길동");
		
		smart.turnOn();
		smart.internetSearch();
		smart.turnOff();
	}

}
