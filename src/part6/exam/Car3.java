package part6.exam;

public class Car3 {

	String company = "쌍용";
	String model;
	String color;
	int maxSpeed;
	
	Car3(){
	}
	
	Car3(String model){
		this.model = model;
	}
	
	Car3(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	Car3(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
