package step01.stream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import model.domain.Kid;

public class Example {

	public static void main(String[] args) {

		try {
//			Kid kidoutKid = new Kid();
//			kidoutKid.setAge(15);
//			kidoutKid.setName("busan");
//			kidoutKid.setPersonaNumber(1234);
//			ObjectOutputStream oskidObjectOutputStream = new ObjectOutputStream(new FileOutputStream("example.txt"));
//			oskidObjectOutputStream.writeObject(kidoutKid);
//
//			oskidObjectOutputStream.close();

			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("example.txt"));
			Kid kidinKid = (Kid) objectInputStream.readObject();

			System.out.println(kidinKid.getAge());
			System.out.println(kidinKid.getName());
			System.out.println(kidinKid.getPersonaNumber());

			objectInputStream.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
