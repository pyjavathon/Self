package part07.exam02;

public class InstanceofParent3 {
	public static void method1(Parent3 parent3) {
		if(parent3 instanceof Child3) {// Child3 타입으로 변환 가능한지 확인
			Child3 child3 = (Child3) parent3;
			System.out.println("method1 - Child3로 변환 성공");
		} else {
			System.out.println("method1 - Child3으로 변환되지 않음");
		}
	}
	
	public static void method2(Parent3 parent3) {
		Child3 child3 = (Child3) parent3;//instanceof로 확인 안하니 예외 발생
		System.out.println("method2 - Child3으로 변환 성공");
	}
	
	
	public static void main(String[] args) {

		Parent3 parentA = new Child3();
		method1(parentA);
		method2(parentA);
		
		Parent3 parentB = new Parent3();
		method1(parentB);
		method2(parentB);
	}

}
