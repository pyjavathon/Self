package part6.exam;

public class Car4 {
	
	String company = "쌍용";
	String color;
	String model;
	int maxSpeed;
	
	Car4(){}
	
	Car4(String color){
		this(color, "자가용", 250);
	}
	
	Car4(String color, String model){//다른 생성자 가리키는 this()
		this(color, model, 250);
	}

	Car4(String color, String model, int maxSpeend){//필드 가리키는 this.
		this.color = color;
		this.model = model;
		this.maxSpeed = maxSpeend;
	}
}
