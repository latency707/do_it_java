/*
 * 얕은 복사
 * 앞에서 객체 배열 사용시에는 반드시 인스턴스를 생성한 후 객체 배열을 입력해야 한다고 했음
 * 인스턴스 생성 없이도 요소값이 출력이 되는 것을 알 수 있음
 * 이유는 인스턴스 자체가 아닌 기존 인스턴스의 주소값만 복사하는 '얕은 복사'가 이뤄졌기 때문임
 * 
 * 두 배열의 서로 다른 요소가 같은 인스턴스를 가리키고 있으므로 복사되는 배열의 인스턴스 값이 변경되면 두 배열이 모두 영향을 받음
 */
package array;

public class ObjectCopy2 {

}
