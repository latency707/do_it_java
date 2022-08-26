/*
 * Class 클래스 활용해 클래스 정보 알아보기
 * 프로그래밍을 하다 보면 사용할 클래스의 정보를 모르는 경우가 생김
 * 이때 Class 클래스를 활용하여 해당 클래스의 생성자,메서드,멤버변수 등의 정보를 가져오고,
 * 	이 정보를 활용하여 인스턴스를 생성하거나 메서드를 호출하는 방식을 '리플렉션'이라고 함
 * 리플렉션 프로그래밍은 잘 안 쓰이니 개념만 알아두기
 * 
*/

// String 클래스 정보 가져오기
package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Class strClass = Class.forName("java.lang.String"); // 클래스 이름으로 가져오기
		
		Constructor[] cons = strClass.getConstructors(); // 모든 생성자 가져오기
		for(Constructor c : cons) {
			System.out.println(c);
		}
		
		System.out.println();
		Field[] fields = strClass.getFields(); // 모든 멤버변수(필드) 가져오기
		for(Field f : fields) {
			System.out.println(f);
		}
		
		System.out.println();
		Method[] methods = strClass.getMethods();
		for(Method m : methods) {
			System.out.println(m);
		}
	}

}
