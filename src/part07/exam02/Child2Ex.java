package part07.exam02;

public class Child2Ex {

	public static void main(String[] args) {
		Parent2 parent2 = new Child2(); //자동 타입 변환
		parent2.field1 = "data1";
		parent2.method1();
		parent2.method2();
		
		Child2 child2 = (Child2) parent2;
		child2.field2 = "yyy";
		child2.method3();

	}

}
