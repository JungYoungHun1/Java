package step02;

public class Ex03Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// B 객체의 생성 완료 시점
		// - 객체의 생성은 객체가 보유하고 있는 모든 멤버변수(필드)들이 메모리에 생성이 되어야 객체의 생성이 완료된다
//		A a = new A();
//		B b = new B();
//		C c = new C();

	}

}

class A {
	A() {
		System.out.println("Class A");
	}
}

class B {
	// 멤버 변수처럼
	A a = new A();

	B() {
		System.out.println("Class B");
	}
}

class C {
	C() {
		System.out.println("Class C");
	}
}
