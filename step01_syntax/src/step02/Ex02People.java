
package step02;

public class Ex02People {

	String name = "Java";
	int age = 27;

	// 기본 생성자 : 객체 생성 시 필수 요소(생략시, 자동완성(기본 생성자만 존재할때))
	public Ex02People() {
	}

	// 사용자 정의 생성자 : 객체 생성 시 초기화 - 생성자 오버로딩
	// 반환값, 형태는 같으나 매개변수의 차이
	public Ex02People(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Ex02People(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void Print() {
//		System.out.println("단순 출력 메소드");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex02People people = new Ex02People();
//		System.out.println(people.getAge());
//		System.out.println(people.getName());
		people.Print();

		people.age = 29;
//		System.out.println(people.getAge());
//		System.out.println(people.getName("New Java"));

		Ex02People people2 = new Ex02People();
		people2.age = 30;
//		System.out.println(people2.getAge());

		Ex02People people3 = new Ex02People("Java3", 45);
		System.out.println(people3.name);

		Ex02People people4 = new Ex02People("Java4");
		System.out.println(people4.name);
		System.out.println(people4.age);

	}

}
