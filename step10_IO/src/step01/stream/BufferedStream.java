package step01.stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedStream {

	public static void main(String[] args) {
		// Buffer : 입력 혹은 출력에 대한 임시 저장공간 -> 데이터를 한번에 처리하는 보조 스트림
		// FileWriter - BufferedWriter

//		try {
//			BufferedWriter bw = new BufferedWriter(new FileWriter("cheerup.txt"));
//			bw.write("여러분~~");
//			bw.write("뭐요 ㅋㅋ");
//			bw.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		// BufferedReader
//		try {
//			BufferedReader br = new BufferedReader(new FileReader("cheerup.txt"));
//			String msg;
//			try {
//				while ((msg = br.readLine()) != null) {
//					System.out.println(msg);
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}

		// Buffered 보조 스트림 성능 차이
		long startTime;
		long endTime;

		try {
			FileInputStream fis = new FileInputStream("run.png");

			startTime = System.currentTimeMillis();
			try {
				while (fis.read() != -1) {
				}
				endTime = System.currentTimeMillis();
				System.out.println("미사용 " + (endTime - startTime) + " ms");
				fis.close();

				// 사용
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream("run.png"));
				startTime = System.currentTimeMillis();
				while (bis.read() != -1) {
				}
				endTime = System.currentTimeMillis();
				System.out.println("미사용 " + (endTime - startTime) + " ms");
				bis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
