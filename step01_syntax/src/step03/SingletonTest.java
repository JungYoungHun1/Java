package step03;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton singleton1 = Singleton.getInstance();
		System.out.println(singleton1);

		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton2);

		singleton1.getName();
		singleton2.getName();
		// 같은 주소값을 가지고 있음
	}

}
