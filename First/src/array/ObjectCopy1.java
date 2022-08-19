/*
 * 객체 배열 복사
 * 문자저장 배열과 마찬가지로 객체 배열도 복사가 가능함
*/

package array;

public class ObjectCopy1 {
	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("Taebaek" , "Jo Jeong Lae");
		bookArray1[1] = new Book("Damian", "Herman Hesse");
		bookArray1[2] = new Book("How do you live", "Yu Si Min");
		System.arraycopy(bookArray1,  0, bookArray2, 0, 3);
		
		for(int i = 0 ; i < bookArray2.length ; i++) {
			bookArray2[i].showBookInfo();
		}	// 앞에서 객체 배열 사용시에는 반드시 인스턴스를 생성한 후 객체 배열을 입력해야 한다고 했는데 인스턴스 생성 없이도 요소값이 출력이 되는 것을 알 수 있음
	}

}
