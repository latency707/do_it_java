// 사용자 정의 예외 테스트
package exception;

public class IDFormatTest {
	private String userID;
	private String password;
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) throws IDFormatException {
		if(userID == null) {
			throw new IDFormatException("ID는 null일 수 없음");
		}
		else if(userID.length() < 8 || userID.length() >20) {
			throw new IDFormatExcetion("ID는 8자 이상, 20자 이하로 쓰시오");
		}
	this.userID = userID;
	}
	
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
		IDFormatTest test = new IDFormatTest();
		
		String userID = null;
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		userID = "1234567";
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		IDFormatTest testPW = new IDFOrmatTest();
		
		String password = null;
		try {
			testPW.setPassword(password);			
		} catch ()
	}

}
