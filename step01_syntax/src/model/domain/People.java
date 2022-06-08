/* 도메인 모델(Domain Model)
 * - 객체 지향 분석 설계 기반으로 구현하고자 하는 비즈니스 영역의 모델을 생성하는 패턴
 * - 속성, 기능 분리
 * - 단순 : 하나의 도메인 객체 = 테이블 하나
 * - 재사용성, 유지보수 용이
 */

// Q1.
/*
 * 매개변수로 들어오는 값을 비교하여 같을 경우 true를 반환하는 메소드 개발 - 메소드명 : checkAdmin / 반환값 :
 * boolean / static 개발 후 실행결과 확인 step01 -> Condition의 if문 활용하여 메소드 개발 -> 메소드명은
 * checkAdmin, 입력 id값이 admin1 or admin2일 때 "관리자 접속 성공" 문자열 출력 -> 실패 시
 * "관리자 접속 실패" 문자열 출력
 */

// Q2.
/*
 * 매개변수로 들어오는 값 비교하여 월(~3월까지만) 확인 메소드 개발 - 함수명 : checkMonth / 반환값 없음 / static
 * step01 -> Condition의 switch / case문 활용하여 메소드 개발
 */

// Q3. printPeopleName 메소드 개발
/*
 * printPeopleName(People[] v){} - 배열 내부의 모든 사람 이름 출력 - name 변수는 직접적인 접근 불가 :
 * private - getName() 호출 가능 : public - for문 활용하여 출력 - 호출만으로 이름 출력할 것
 */

package model.domain;

public class People {
	// 멤버 변수(필드)
	// 캡슐화(Capsulation)
	private String name;
	private int age;

	// 생성자
	public People() {
	}

	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// get 메소드 : getter

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// set 메소드 : setter

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;
		} else {
			System.out.println("입력한 나이는 유효하지 않습니다.");
		}
	}

}
