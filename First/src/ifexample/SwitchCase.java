/* switch - case문
 * 조건문을 구현할 떄 if문을 사용하면 번거로운 경우가 있음 * 
 * 조건이 많아질 경우 중괄호가 많아지고 코드 또한 길어져 가독성이 떨어지기 때문임
 * 
 * 이때 switch-case문으로 코드를 구성하는 것이 코딩이 깔끔하고 가독성도 높음
 * switch-case문은 주로 조건이 하나의 변수값이나 상수값으로 구분되며 조건식이 복잡하지 않은 경우에 적합함 
 * 
 * 자바 7부터는 case 값에 정수 값 뿐 아니라 문자열도 사용할 수 있게 되어 보다 간결한 프로그램 구현이 가능해짐.
*/

// 선수 성적 구분 switch-case 문 만들기
package ifexample;

public class SwitchCase {
	public static void main(String[] args) {
		int rank = 5;
		char medalColor;
		
		switch(rank) {
		case 99 : medalColor = 'G';
		break;
		
		case 98 : medalColor = 'S';
		break;
		
		case 97: medalColor = 'B';
		
		default:
			medalColor ='A';
		}
		
		System.out.println(rank + "등 메달의 색깔은 " + medalColor + " 입니다.");
		
	}

}
