package model.domain;

public class Person {
	private String name;
	private String mbti;

//	public Person(String string, String string2) {
//		// TODO Auto-generated constructor stub
//	}

	public Person(String name, String mbti) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.mbti = mbti;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMbti() {
		return mbti;
	}

	public void setMbti(String mbti) {
		this.mbti = mbti;
	}

}
