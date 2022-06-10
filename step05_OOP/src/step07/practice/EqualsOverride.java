package step07.practice;

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/*
	 * equals 재정의
	 * 
	 * 1. 매개변수로 들어온 object 타입의 객체 -> Person 타입으로 형변환이 가능한지 2. instanceof 3. name,
	 * age 값을 비교 4. 검증 후 name과 age가 갖고 있는 데이터가 동일한 경우 = true 반환
	 */
	@Override
	public boolean equals(Object object) {
		if (object instanceof Person) {
			if (((Person) object).name == name && ((Person) object).age == age) {
				return true;
			}
		}
		return false;
	}

}

class Person2 {
	String name;
	int age;

	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class EqualsOverride {

	public static void main(String[] args) {
		Person p1 = new Person("Java", 27);
		Person p2 = new Person("Java", 27);
		Person2 p3 = new Person2("Java", 27);

		// 주소값
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());

		// equals
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));

	}

}
