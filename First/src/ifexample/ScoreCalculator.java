/*
 * Q) 성적에 따라 학점 부여하기
 * 성적에 따라 학점을 부여하는 프로그램을 만들어보시오
 * 100~90점은 A, 89~80점은 B, 79~70점은 C, 69~60점은 D, 나머지는 F
*/

package ifexample;

public class ScoreCalculator {
	public static void main(String[] args) {
		int score = 61;
		char grade;
		
		if (score >= 90) {
			grade = 'A';
			System.out.println(grade);
		}
		
		else if (score >=80) {
			grade = 'B';
			System.out.println(grade);
		}
		
		else if (score >= 70) {
			grade = 'C';
			System.out.println(grade);
		}
		
		else if (score >=60) {
			grade = 'D';
			System.out.println(grade);
		}
		
		else {
			grade = 'E';
			System.out.println(grade);
		}
		
		/*
		 * if - else 문은 03잠에서 배운 조건 연산자로도 구현할 수 있다.
		 * 다만 if - else 문이 가독성이 뛰어남. 
		 * 즉, 간단한 조건문이고 선택이 2가지만 있는 경우에는 조건 연산자를 사용해도 무방하다는 뜻
		 * 
		 * Q) 다음 조건식을 조건 연산자 형태로 바꿔보시오.
		 * if (score >= 90) {grade = 'A'; } else {grade = 'B';}
		 * A) grade = (score >= 90) ? 'A' : 'B';
		 * 
		 */
	}

}
