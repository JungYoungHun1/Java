/* 싱글톤 패턴(Singleton Pattern)
 * - 하나의 객체만 생성 가능 -> 내부의 메소드 혹은 데이터를 사용하는 경우
 */

package step03;

public class Singleton {

	// 멤버 변수
	private static Singleton instance = new Singleton();

	// private 생성자
	private Singleton() {
	}

	// 메소드(getInstance) : 내부에서 생성된 객체를 공유하도록 설정
	public static Singleton getInstance() {
		return instance;
	}

	public static void getName() {
		System.out.println("getName");
	}
}
