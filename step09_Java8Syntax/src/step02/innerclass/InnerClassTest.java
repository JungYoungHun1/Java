package step02.innerclass;

import step02.innerclass.OuterClass.StaticInClass;

class OuterClass {

	private int number = 10;
	private static int staticNumber = 20;
	private InClass inClass;

	public OuterClass() {
		inClass = new InClass();
	}

	class InClass {
		int inNumber = 100;
//		static int staticInNumber = 200;

		void inPrint() {
			System.out.println("외부 클래스, 인스턴스 변수" + number);
			System.out.println("외부 클래스, static 변수" + staticNumber);
			System.out.println("내부 클래스, 인스턴스 변수" + inNumber);
		}

//		static void staticInPrint() {
//			
//		}

	}

	static class StaticInClass {
		int inNumber = 100;
		static int staticInNumber = 200;
	}
}

public class InnerClassTest {

	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		OuterClass.InClass inClass = outerClass.new InClass();

		OuterClass.StaticInClass staticInClass = new StaticInClass();
		System.out.println(staticInClass.inNumber);
		System.out.println(staticInClass.staticInNumber);
	}
}
