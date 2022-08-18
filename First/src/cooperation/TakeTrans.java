// 학생, 버스, 지하철 객체 협력하기
package cooperation;

public class TakeTrans {
	public static void main(String[] args) {
		// 학생 인스턴스 2개 생성
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);		// 노선번호 100번 버스 생성
		studentJames.takeBus(bus100);	// james가 100번 버스 탑승
		studentJames.showInfo();		// james 정보 출력
		bus100.showInfo();				// 버스 정보 출력
		
		Subway subwayGreen = new Subway("Line 2");	// 노선번호 2번 지하철 생성
		studentTomas.takeSubway(subwayGreen);		// tomas 2호선 탑승
		studentTomas.showInfo();					// tomas 정보 출력
		subwayGreen.showInfo();						// 버스 정보 출력
	}

}
