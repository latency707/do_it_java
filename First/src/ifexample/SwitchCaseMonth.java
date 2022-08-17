/*
 * case문 동시 사용
 * case 1~ 12를 각각 달력의 월이고 수행문을 날짜라고 했을때, case 값은 총 12개지만 수행문이 같은 경우가 있음
 * 이 경우 case 문을 동시에 사용할 수 있음
 * 
 * switch-case문에서 break의 역할
 * break문은 switch-case문의 수행을 멈추고 빠져나가는 기능임
 * break문을 사용하지 않으면 조건에 맞는 수행문을 실행한 후 나머지 문장까지 전부 수행되어 전혀 다른 결과를 얻을 수 있음.
*/

package ifexample;

public class SwitchCaseMonth {
	public static void main(String[] args) {
	
		int month = 12 ; // 원하는 월(달) 입력
		int day;
		
		switch(month) {
		
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : day = 31;
		System.out.println(month +"월은" + day + "일까지 있습니다.");
		break;
		
		case 4 : case 6 : case 9 : case 11 : day = 30;
		System.out.println(month +"월은" + day + "일까지 있습니다.");
		break;
		
		case 2 : day = 28;
		System.out.println(month +"월은" + day + "일까지 있습니다.");
		break;
		}
		
	}

}
