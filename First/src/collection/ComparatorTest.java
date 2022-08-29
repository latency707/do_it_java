package collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{
	@Override
	public int compare(String s1, String s2) {
		return (s1.compareTo(s2)) * (-1); // 내림차순 정렬
	}
}

public class ComparatorTest{
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>(new MyCompare()); // TreeSet 생성자의 매개변수로 정렬방식 지정
		
		set.add("aaa");
		set.add("ccc");
		set.add("bbb");
		
		System.out.println(set);
	}
}
