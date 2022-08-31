// 사용자 정의 예외 테스트
package exception;

public class PWFormatTest {
	private String password;
	
	public void setPassword(String password) throws PWFormatException {
		if(password == null){
			throw new PWFormatException("비밀번호는 null일 수 없음");
		}
		else if(password.matches("[a-zA-z]+")) {
			throw new PWFormatException("비밀번호는 문자열로만 구성할 수 없음");
		}
		else if(password.length() < 5) {
			throw new PWFormatException("비밀번호는 5자 미만일 수 없음");
		}
	this.password = password;
				
	}
	
	public static void main(String[] args) {
		PWFormatTest testPW = new PWFormatTest();
		
		String password = null;
		try {
			testPW.setPassword(password);			
		} catch (PWFormatException e) {
			System.out.println(e.getMessage());
		}
		
		
		// 문자열 예외
		
		
		
		// 5자 미만 예외
	}

}
