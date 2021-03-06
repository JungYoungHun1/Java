/* 클래스와 객체
 * - 설계
 * 	1. 데이터(멤버 변수, 필드) : name, age 
 * 	2. 기능(메소드)  : name, age 값 반환 / 단순 출력 
 */

package step02;

public class Ex01People {

	// 멤버 변수(필드)
	String name = "Java";
	int age = 25;

	// 생성자 : 객체 생성시 필수 요소
	// 클래스의 이름과 동일해야 함
	// 반환값이 없음
	public Ex01People() {
	}

	// 메소드
	// name 반환 메소드
	// 1. 메소드명 : getName
	// 2. 반환값 유무

	// 반환값 타입 지정 필수
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// 단순 출력("단순 출력 메소드") 메소드
	// 1. 메소드명 : print
	// 2. 반환값의 유무 : void(반환 타입 없음)

	public void Print() {
		System.out.println("단순 출력 메소드");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex01People people = new Ex01People();
//		System.out.println(people.Print());
		people.Print();
	}

}
