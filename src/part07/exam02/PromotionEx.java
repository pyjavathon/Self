package part07.exam02;

	class A {}
	
	class B extends A{}
	class C extends A{}
	
	class E extends B {}
	class F extends C {}
	
public class PromotionEx {
	
	public static void main(String[] args) {
		
		B b = new B();
		C c = new C();
		E e = new E();
		F f = new F();
		
		A a1 = b;
		A a2 = c;
		A a3 = e;
		A a4 = f;
		
		//B b1 = f; 상속관계에 있지 않아서 컴파일 에러 남
		//C c2 = e;
	}

}
