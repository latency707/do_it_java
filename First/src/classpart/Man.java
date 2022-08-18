/*
 * Q) 다음 예제의 클래스를 만들고 결과값을 출력해보자
 * 나이 40세, 이름은 James 라는 남자가 있다. 이 남자는 결혼을 했고 자식이 3명 있다
 * <출력결과>
 * 나이
 * 이름
 * 결혼여부
 * 자녀 수
 * 
*/

// Man 클래스 만들기 (ManTest 에서 테스트)
package classpart;

public class Man {
	int age;
	String personName;
	boolean isMarried;
	int noc;
	
	public int getNoc() {
		return noc;
	}

	public boolean getIsMarried() {
		return isMarried;
	}
	
	public String getPersonName() {
		return personName;
	}
	
	public int getAge() {
		return age;
	}

	public void setNoc(int noc) {
		this.noc = noc;
	}
	
	public void setIsMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}


	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public void setAge(int age) {
		this.age = age; 
	}
	

}
