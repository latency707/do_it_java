/*
 * 어러 자바 파일에서 공유하는 상수 정의
 * 하나의 자바 파일에서만 사용하는 상수값은 해당 파일 안에서 정의해서 사용할 수 있음
 * 간혹 여러 파일에서 똑같이 공유해야만 하는 상수도 있음
 * 예시)MIN, MAX, 과목코드 표준 등
 * 이런 값들은 생성되는 파일마다 선언하면 코드 중복, 수정이 갈수록 어려워짐
 *  
 *  따라서 자바 프로젝트 진행시에는 여러 파일에서 공유해야하는 상수값은 한 파일에 모아 
 *  	public static final로 선언하여 사용 시 작업에 용이함
*/

// 여러 파일에서 공유하는 상수
// 모든 상수를 public, static으로 선언해 외부에서의 사용 및 인스턴스와 관계없이 클래스 명으로 참조가 가능함
package finalex;

public class Define {
	public static final int MIN = 1;
	public static final int MAX = 99999;
	public static final int ENG = 1001;
	public static final int MATH = 2001;
	public static final double PI = 3.14;
	public static final String GOOD_MORNING = "Good Morning!";

}
