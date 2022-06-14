package model.domain;

import java.io.Serializable;

public class Kid implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1948208089451603759L;
	private String name;
	private int age;
	private transient int personaNumber;
	// 클래스 내부에 오브젝트 객체가 존재한다면 이 클래스는 직렬화가 되지않음

	public Kid() {
	};

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPersonaNumber() {
		return personaNumber;
	}

	public void setPersonaNumber(int personaNumber) {
		this.personaNumber = personaNumber;
	}

	@Override
	public String toString() {
		return "Kid [name=" + name + ", age=" + age + ", personaNumber=" + personaNumber + "]";
	}

	public Kid(String name, int age, int personaNumber) {
		super();
		this.name = name;
		this.age = age;
		this.personaNumber = personaNumber;
	}
}
