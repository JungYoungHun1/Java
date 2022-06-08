/* static(정적)
 * - 클래스의 소속
 * - 객체 생성  없이도 사용 가능
 * - 사용 : 공용 데이터값 지정, 변수, 메소드
 */

package step02;

public class Ex04Static {
	// 멤버 변수와 static 멤버 변수 - static은 바로 메모리에 올라감
	String name;
	static String company = "busan";

	// 변하지 않는 수 - 상수(final, static) 대문자, 언더바
	static final double PI = 3.14;

	public Ex04Static(String name) {
		this.name = name;
	}

	static void print() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex04Static static1 = new Ex04Static("Java");
		System.out.println(static1.name);
		System.out.println(company);
		System.out.println(PI);
	}

}
