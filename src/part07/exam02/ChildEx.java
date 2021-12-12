package part07.exam02;

public class ChildEx {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;//자동타입변환
		parent.method1();
		parent.method2();//오버라이드해서 재정의했으므로 자식꺼 호출됨
		//parent.method3(); 자식클래스에만 있어서 호출불가능
		

	}

}
