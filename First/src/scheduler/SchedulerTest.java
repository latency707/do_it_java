// 입력 문자에 따라 배분 정책을 정하고 실행하는 프로그램 구현하기
package scheduler;
import java.io.IOException;

public class SchedulerTest {
	public static void main(String[] args) throws IOException {	// 문자를 입력받는 System.in.read() 를 사용하려면 IOException에서 오류를 처리해줘야함
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R: 한명씩 차례로 할당 ");
		System.out.println("L: 쉬고 있거나 대기가 가장 적은 상담원에게 할당 ");
		System.out.println("P: 우선순위가 높은 고객 먼저 할당 ");
		
		int ch = System.in.read();	// 할당 방식을 입력받아 ch 변수에 대입
		Scheduler scheduler = null;
		
		// 입력값이 R or r 이면 RoundRobin 클래스 생성
		if(ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		}
		
		// 입력값이 L or l 이면 LeastJob 클래스 생성
		else if (ch == 'L' || ch == 'l') {
			scheduler = new LeastJob();
		}
		
		// 입력값이 P or p 이면 PriorityAllocation 클래스 생성
		else if(ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		}
		
		// Q) 상담전화 배분 정책 추가하기 AgentGetCall
		else if(ch == 'A' || ch == 'a') {
			scheduler = new AgentGetCall();
		}
		
		else {
			System.out.println("지원하지 않는 기능입니다.");
			return;
		}
		
		// 정책과 무관하게 인터페이스에 선언했던 메서드 호출=다형성 구현
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}
}
