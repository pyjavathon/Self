package part07.exam02;

import part07.exam01.A;

public class D extends A {
	
	public D() {
		super();//다른 패키지 자식이라서 new로는 못만듦. super로 A 생성자 호출할 수 있음.
		this.field = "value";
		this.method();
	}

}
