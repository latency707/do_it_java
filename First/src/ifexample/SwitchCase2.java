// switch-case 문에 문자열 사용해보기
package ifexample;

public class SwitchCase2 {
	public static void main(String[] args) {
		String medal = "None";
		
		switch(medal) {
		case "Gold":
			System.out.println("Gold Medal");
			break;
			
		case "Silver":
			System.out.println("Silver Medal");
			break;
			
		case "Bronze":
			System.out.println("Bronze Medal");
			break;
			
		default:
			System.out.println("MOOGWAN");
			break;
		}
	}

}
