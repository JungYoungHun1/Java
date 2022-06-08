/* 접근 제한자(Access Modifier)
 * 1. 호출 가능 범위 
 * - public : 동일 class / package, 외부 package
 * - private : 동일 class만 가능
 * - default : (생략시)동일 class/ package
 * - protected : 동일 class / package, 상속 관계일 경우 외부 package 가능 
 * 
 * 2. 사용 가능 위치 
 * - 클래스 선언구 : public, default
 * - 변수/생성자/메소드 선언구 : public, default, private, protected 
 */
package step02;

import model.domain.People;

public class Ex05Access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People people = new People("Java", 27);

		System.out.println(people.getName());
		System.out.println(people.getAge());

		people.setAge(100);
		System.out.println(people.getAge());
		people.setAge(-1);

		// private으로 선언했기 때문에 직접 접근 불가
//		System.out.println(people.age);

	}

}
