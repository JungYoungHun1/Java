package step04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OptionalStreamTest {

	public static void main(String[] args) {
		// Optional
		// empty : 빈 Optional 객체 생성
		Optional<String> opt1 = Optional.empty();
//		System.out.println(opt1);

		// of(value) : null이 아닌 데이터 생성(null 저장시 NPE)
		Optional<String> opt2 = Optional.of("Java");
//		System.out.println(opt2);
//		System.out.println(opt2.get());

//		Optional<String> opt3 = Optional.of(null); // 예외 발생
//		System.out.println(opt3);

		// ofNullable : 값이 Null일수도, 아닐수도 있는 경우
//		Optional<String> opt4 = Optional.ofNullable("Java");
//		System.out.println(opt4);
//		
//		Optional<String> opt5 = Optional.ofNullable(null);
//		System.out.println(opt5);

		// ifPresent
//		Optional<String> opt6 = Optional.ofNullable("Java");
//		opt6.ifPresent(v -> System.out.println(v.charAt(0)));
//		
//		Optional<String> opt7 = Optional.ofNullable(null);
//		opt7.ifPresent(v -> System.out.println(v));

		// orElse : 파라미터로 값을 받음
		// orElseGet : 파라미터로 함수형 인터페이스를 받음
//		Optional<String> opt8 = Optional.ofNullable("Java");
//		System.out.println(opt8.orElse("orElse 실행"));
//		
//		Optional<String> opt9 = Optional.ofNullable(null);
//		System.out.println(opt9.orElse("orElse 실행"));

		// orElseThrow
//		Optional<String> opt10 = Optional.ofNullable(null);
//		System.out.println(opt10.orElseThrow(IllegalArgumentException::new));

		// Stream
		// step01 Stream 생성
		ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		System.out.println(arr1);

		Stream<Integer> stream1 = arr1.stream();
		System.out.println(stream1);
		stream1.forEach(num -> System.out.println(num));

		// step02 중개 연산
		// Filter : Stream 내 요소 중 조건에 맞는 것을 선택
		List<String> arr2 = Arrays.asList("apple", "banana", "melone");
		arr2.stream().filter(v -> v.contains("a"));

		// Map : Stream 내 요소가 특정 로직 수행 후 새로운 스트림 반환
		List<Integer> arr3 = Arrays.asList(1, 2, 3);
		arr3.stream().map(v -> v + 1);

		// Sorted : 정렬/역순 정렬
		arr3.stream().sorted();
		arr3.stream().sorted(Comparator.reverseOrder());

		// step03 최종 연산
		// count, min, max, sum
		// foreach
		// collect

		List<Integer> arr4 = Arrays.asList(1, 2, 3, 3, 3, 4, 5, 5);
		System.out.println(arr4);
		arr4.stream().collect(Collectors.toSet()).forEach(v -> System.out.println(v));

		// reduce
		System.out.println(arr4.stream().reduce(0, (v1, v2) -> v1 + v2));

		// ex.sorted
		Arrays.asList("B", "AB", "O", "A").stream().sorted().forEach(System.out::println);

		// sum
		System.out.println(IntStream.of(1, 5, 8, 3, 6).sum());
	}

}
