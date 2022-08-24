// Scheduler 인터페이스 정의하기
package scheduler;

public interface Scheduler {
	// 추상메서드 2개
	public void getNextCall();
	public void sendCallToAgent();

}
