package part6.exam;

public class Car3Ex {

	public static void main(String[] args) {

		Car3 car1 = new Car3();
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		Car3 car2 = new Car3("자가용");
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		Car3 car3 = new Car3("자가용","블랙");
		System.out.println("car1.company : " + car1.company);
		System.out.println("car2.model : " + car2.model );
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		Car3 car4 = new Car3("자가용","black",200);
		System.out.println("car1.company : " + car1.company +"\n" + "car2.model : " + car2.model
				+"\n"+ "car3.color : " + car3.color + "\n"+"car4.maxSpeed : " + car4.maxSpeed);
		
	}

}
