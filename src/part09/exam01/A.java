package part09.exam01;

public class A {//바깥 클래스
	A(){System.out.println("A 객체가 생성됨");}

	class B {//인스턴스 멤버 클래스
		B() {System.out.println("B 객체가 생성됨");}
		int field1;
		void method1() {}
	}
	
	static class C {//정적 멤버 클래스
		C (){System.out.println("C 객체가 생성됨");}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	void method() {
		class D {//로컬 클래스
			D(){System.out.println("D 객체가 생성됨");}
			int field1;
			void method1() {}
		}
		D d = new D();
		d.field1 =3;
		d.method1();
	}
}
