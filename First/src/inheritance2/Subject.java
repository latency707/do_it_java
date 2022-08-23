/*
 * 상속을 항상 사용하는 것이 좋은가?
 * 상속은 IS-A 관계에서 사용하는 것이 가장 효율적임
 * IS-A 란 is a relationship 의 약어로, 일반적인 개념과 구체적인 개념의 관계를 뜻함
 * 일반 클래스를 점차 구체화해야하는 상황에서 상속을 사용하는 것이 적절한 상속의 사용
 * 
 * 예를 들어 다음과 같은 Subject 클래스를 만든 후 Student 클래스를 만들 시 상속
 * 모든 학생은 전공과목을 가지고 있지만 Student를 포괄하는 개념은 아님
 * 이런 관계를 HAS-A, has a relationship 으로 표현함
 * HAS-A 관계, 즉 한 클래스가 다른 클래스를 소유하는 경우는
 * class Student {
 * 		Subject majorSubject; 
 * }
 * 이와 같이 한쪽이 포함되어 멤버변수로 사용하는 것이 적절함
 * 
 * 
 * *** 상속은 코드 재사용의 개념과는 다르다 ***
*/

// 상속 사용에 적합하지 않은 코드 짜보기 (HAS-A 관계)
//package inheritance2;
//
//public class Subject {
//	private int subjectID;
//	private int subjectName;
//	
//	public int getSubjectId() {
//		return subjectId;
//	}
//	
//	public void setSubjectId(int subjectId) {
//		this.subjectID = subjectId;
//	}
//	
//	public int getSubjectName() {
//		return subjectName;
//	}
//	
//	public void setSubjectname(int subjectName) {
//		this.subjectName = subjectName;
//	}
//	
//	public void showSubjectInfo() {
//		System.out.println(subjectId + "," +subjectName);
//	}
//
//}
