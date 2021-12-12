package part6.exam;

public class Car4Ex {

	public static void main(String[] args) {

		Car4 car1 = new Car4();
		System.out.println("car1.company : " + car1.company);
		
		Car4 car2 = new Car4("black");
		System.out.println("car1.company : " + car1.company + "\n" + "car2.color : " + car2.color);
		
		Car4 car3 = new Car4("black", "자가용");
		System.out.println("car1.company : " + car1.company + "\n" + "car2.color : "+ car2.color +
				"\n"+ "car3.model : " + car3.model);
		
		Car4 car4 = new Car4("black","자가용",200);
		System.out.println("car1.company : " + car1.company + "\n" + "car2.color : "+ car2.color +
				"\n" + "car3.model : " + car3.model +"\n"+ "car4.maxSpeed : " + car4.maxSpeed);
		
	}

}
