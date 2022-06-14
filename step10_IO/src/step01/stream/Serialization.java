package step01.stream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import model.domain.Kid;

public class Serialization {

	public static void main(String[] args) {
		// 객체 출력 - ObjectOutputStream
		try {
//			FileOutputStream fos = new FileOutputStream("Object.txt");
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
//
//			oos.writeObject(new String("Busan"));
//			oos.writeObject(new Integer(1));
//
//			oos.close();
//			fos.close();
//
//			System.out.println("객체 출력");

			// 객체 입력 - ObjectInputStream
//			FileInputStream fis = new FileInputStream("Object.txt");
//			ObjectInputStream ois = new ObjectInputStream(fis);
//
//			System.out.println((String) ois.readObject());
//			System.out.println((Integer) ois.readObject());
//
//			boolean flag = true;
//			Object object = null;
//			while (flag) {
//				object = ois.readObject();
//				System.out.println(object);
//			}
//			ois.close();
//			fis.close();

			// 직렬화
//			Kid kidOut = new Kid();
//			kidOut.setName("Busan");
//			kidOut.setAge(27);
//			kidOut.setPersonaNumber(12345);
//
//			ObjectOutputStream oosKid = new ObjectOutputStream(new FileOutputStream("Kid.txt"));
//			oosKid.writeObject(kidOut);
//
//			oosKid.close();

			// 역직렬화
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Kid.txt"));

			Kid kidIn = (Kid) ois.readObject();

			System.out.println(kidIn.getAge());
			System.out.println(kidIn.getName());
			System.out.println(kidIn.getPersonaNumber());

			ois.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
