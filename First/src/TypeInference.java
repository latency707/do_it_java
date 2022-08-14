/*
 * 자료형 없이 변수 선언
 * 자바는 모든 변수를 사용할 때 사용할 자료형을 정확히 명시해야 함
 * 자바 10부터 자료형을 쓰지 않고도 변수를 사용할 수 있는 '지역 변수 자료형 추론'이라고 함
 * 변수에 대입되는 자료를 보고 컴파일러가 추측하는 방식이고 변수명 앞에 자료형 대신 var을 지정하는 식으로 사용함  
 * 
 * 지역 변수 자료형 추론 유의사항
 * 한 번 선언한 자료형 변수를 다른 자료형으로 사용할 수 없음
 * 자료형 없이 변수를 선언하는 방법은 지역 변수만 가능함(지역변수: 프로그램의 { } 내에서 사용할 수 있는 변수)
 * 
 * 
*/

// var 키워드 사용해보기
public class TypeInference {
	public static void main(String[] args) {
		var i = 10;			// int i = 10 으로 컴파일됨
		var j = 10.0;		// double j = 10.0 으로 컴파일됨
		var str = "hello";	// String str = "hello" 로 컴파일됨
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test"; // String 자료형으로 컴파일되었으므로 문자열은 대입 가능
//		str = 3; // 최초 변수선언에서 이미 String 자료형으로 사용되었기 때문에 정수 값을 넣을 시 오류 발생
	}

}
