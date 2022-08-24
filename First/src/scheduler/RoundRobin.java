// 상담전화 순서대로 배분하기
package scheduler;

public class RoundRobin implements Scheduler {
	@Override
	public void getNextCall() {
		System.out.println("상담전화를 순서대로			                 대기열에 저장합니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서 상담원에게 배분합니다.");
	}
}
