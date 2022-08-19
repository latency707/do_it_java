// 변수의 주소값 비교하기
package singleton;

public class CompanyTest {
	public static void main(String[] args) {
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		// 두 변수가 같은 주소인지 확인
		System.out.println(myCompany1 == myCompany2);	// true
	}

}
