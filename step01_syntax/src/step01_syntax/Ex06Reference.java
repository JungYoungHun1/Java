/* 참조 타입
 * - 변수 -- 스택, 객체 -- 힙 영역에서 생성
 * - 기본값 : null
 * 		- 참조할 객체가 없을 경우, NullPointerException 발생(NPE)
 * 
 */

package step01_syntax;

import java.util.Arrays;

public class Ex06Reference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열 (String)
		// ==, equals
//		String str1 = "Java";
//		System.out.println(str1);
//		System.out.println(str1.hashCode());

//		str1 = null;
//		System.out.println(str1);
//		System.out.println(str1.hashCode()); // NPE 발생!

		/*
		 * 배열 (Array): 데이터 값 여러가지를 한개의 변수에 대입 - 구조 : 타입 [] 변수명 = {요소1, 요소2, 요소3...} - 특징
		 * : 길이(사용가능한 데이터 값의 갯수)가 고정 - 종류 : 1차원, 다차원 배열
		 */

		// 배열 선언 및 초기화
		int[] arr1 = { 1, 2, 3 };

		String[] arr2 = { "one", "two", "three" };

		int[] arr3;
		arr3 = new int[] { 4, 5, 6 };

		int[] arr4 = new int[3];

		// 배열값 접근 : index - 0부터 시작
//		System.out.println(arr1[0]);
//		System.out.println(arr1[3]); java.lang.ArrayIndexOutOfBoundsException

		// 배열의 길이 : length
//		System.out.println(arr1.length);

		// 배열의 데이터값
//		System.out.println(arr1);

		// step01
//		for (int i = 0; i < arr1.length; i++) {
//			System.out.println(arr1[i]);
//		}

		// step02
//				for (int i : arr3) {
//					System.out.println(i);
//				}

//		int arr5[] = {1,2,3};
//		int arr6[] = arr5;
//		
//		System.out.println(arr6[0]);
//		System.out.println(arr5[0]);
//		
//		arr6[0] = 10;
//		System.out.println(arr6[0]);
//		System.out.println(arr5[0]);

		// 깊은 복사
		int[] arr7 = { 1, 2, 3 };
//		int [] arr8 = new int[arr7.length];
//		for (int i = 0; i < arr7.length; i++) {
//			arr8[i] = arr7[i];
//		}
//		arr7[0] = 10;
//		System.out.println(arr7[0]);
//		System.out.println(arr8[0]);

		int[] arr9 = arr7.clone();
		for (int i : arr9) {
			System.out.println(i);
		}

		int[] arr10 = Arrays.copyOf(arr7, arr7.length); // 길이 지정 가능
		for (int i : arr10) {
			System.out.println(i);
		}

		// 2차원 배열
		int[][] arr11 = new int[3][4];

	}

}
