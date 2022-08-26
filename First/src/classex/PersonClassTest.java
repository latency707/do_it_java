// Person 클래스의 Class 클래스를 가져와서 getConstructors(), getMethods(), getFields() 메서드로 클래스 정보를 가져오시오
package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonClassTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Class personClass = Class.forName("classex.Person");
		
		Constructor[] cons = personClass.getConstructors();
		for(Constructor c : cons) {
			System.out.println(c);
		}
		
		System.out.println("============");
		Field[] fields = personClass.getFields(); // 모든 멤버변수(필드) 가져오기
		for(Field f : fields) {
			System.out.println(f);
		}
		System.out.println("============");
		Method[] methods = personClass.getMethods(); // 모든 메서드 가져오기
		for(Method m : methods) {
			System.out.println(m);
		}
			
		}

}
