package part11.api01;

import part6.exam03.Car;

public class ClassEx {

	public static void main(String[] args) {
		
		Class clazz = Car.class;//첫번째 방법
		
		//Class clazz = Class.forName("part11.api01.Car");//두번째
		
		//Car car = new Car();
		//Class clazz = car.getClass();//세번째
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
	}

}
