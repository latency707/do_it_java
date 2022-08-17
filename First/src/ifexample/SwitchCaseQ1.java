/*
 * switch-case문 연습하기
 * 1층 약국, 2층 정형외과, 3층 피부과, 4층 치과, 5층 헬스 클럽으로 이뤄진 5층 건물이 있다.
 * 건물의 층을 누르면 어떤 곳인지 알려주는 엘리베이터를 switch-case로 구현하라
 * 예시) n층 헬스 클럽입니다.
*/


package ifexample;

public class SwitchCaseQ1 {
	public static void main(String[] args) {
		int floor = 3;
		
		switch (floor) {
			case 1:
				System.out.println(floor + "층 약국입니다.");
				break;
			
			case 2:
				System.out.println(floor + "층 정형외과입니다.");
				break;
				
			case 3:
				System.out.println(floor + "층 피부과입니다.");
				break;
				
			case 4:
				System.out.println(floor + "층 치과입니다.");
				break;
				
			case 5:
				System.out.println(floor + "층 헬스 클럽입니다.");
				break;
			
		}
	}

}
