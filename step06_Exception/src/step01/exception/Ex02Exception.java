package step01.exception;

class Info {
	static {
		System.out.println("Info Class");
	}
}

public class Ex02Exception {

	public static void main(String[] args) {
//		try {
//			Class.forName("step01.exception.Info");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//
//		} finally {
//			System.out.println("무적권 나옴ㅋㅋ");
//		}

		// catch문 순서
		try {
			String str1 = null;
			System.out.println(str1.length());

			String str2 = "three";
			Integer.parseInt(str2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
