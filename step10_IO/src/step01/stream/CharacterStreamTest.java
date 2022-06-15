package step01.stream;

import java.io.FileReader;
import java.io.IOException;

public class CharacterStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//			FileWriter fw = new FileWriter("CharacterStream.txt");
//			fw.write("여행 가고 싶음 " + "\n");
//			fw.write("대구로 ㅋㅋ" + "\n");
//
//			fw.write(new char[] { '대', '구' });
//			fw.close();
//			System.out.println("저장 성공");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		// Reader
		try {
			FileReader fr = new FileReader("CharacterStream.txt");

			int data;
			while ((data = fr.read()) != -1) {
				System.out.println((char) data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
