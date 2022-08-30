// ArrayList에서 스트림 활용
package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		// 스트림 생성
		Stream<String> stream = sList.stream();
		//배열 요소 하나씩 출력
		stream.forEach(s -> System.out.println(s + " "));
		System.out.println();
		
		sList.stream().sorted().forEach(s -> System.out.println(s));
		// 스트림 새로 정렬 | 정렬 |   요소를 하나씩 추출해서 정렬
	}
	

}
