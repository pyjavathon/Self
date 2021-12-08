package self.exam02;

public class VariableUseExample {

	public static void main(String[] args) {
		//변수 선언과 연산
		int hour = 3;
		
		int minute = 5;
		
		System.out.println(hour + "시간" + minute + "분");
		
		int totalMinute = (hour * 60) + minute;
		
		System.out.println("총 " + totalMinute + "분");
		
	}

}
