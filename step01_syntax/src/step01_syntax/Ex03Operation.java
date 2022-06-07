package step01_syntax;

public class Ex03Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자 연산 : +, -, *, /, %

//		int v1 = 10;
//		int v2 = 3;
//		System.out.println(v1 % v2);

		// 증감 연산 : ++, --
//		System.out.println(++ v1);
//		System.out.println(v1 ++);
//		System.out.println(v1);

		// 기본 연산
		byte v3 = 10;
		byte v4 = 3;
		byte v5 = (byte) (v3 + v4);
//		System.out.println(v5);

//		System.out.println(((double)v3/v4));

//		System.out.println((5 / 0.0) + 2);

		// 논리 연산 : &, |, ^, !

		boolean isTrue = true;
		boolean isFalse = false;

		// &, &&
//		System.out.println(isTrue && isTrue);
//		System.out.println(isTrue && isFalse);
//		System.out.println(isTrue & isFalse);

		// ^ : 연산 결과 하나는 true 다른 하나는 false
//		System.out.println(isTrue ^ isFalse);
//		System.out.println(isTrue ^ isTrue);

		// ! : 논리값을 변경
//		System.out.println(!isTrue);

		// 비교 연산 <, <=, >, >=, ==, !==
		int num1 = 1;
		int num2 = 10;
//		System.out.println(num1 == num2);

		double num3 = 1.0;
//		System.out.println(num1 == num3);

		// 대입 연산 += -= *= /=
		int assign = 1;
		assign *= 10;
//		System.out.println(assign);

		// 문자열(String) 연산
		String str1 = "String 1";
		String str2 = "String 1";
		String str3 = "String 2";
		String str4 = new String("String 1");
		System.out.println(str1 == str4);

		// equals : 문자열 내용이 같은지 여부
		System.out.println(str1.equals(str2)); // true
		System.out.println(str1.equals(str3)); // false
		System.out.println(str1.equals(str4)); // false

		// 삼항 연산 : 조건? 결과1 : 결과2
		// 67.5g 초과이면 A등급, 그 외
		double meat = 66.1;
		String grade = (meat > 67.5 ? "A" : "그 외 등급");
		System.out.println(grade);

	}

}
