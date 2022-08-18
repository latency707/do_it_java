/*
 * Q)
 * 쇼핑몰 주문 내용에 대한 클래스 생성,
 * 주문 내용을 인스턴스로 생성,
 * 인스턴스 생성 후 이 형식으로 주문 내용 출력하시오
 * 
 * 주문번호 : 201803120001
 * 주문자 ID : abc123
 * 주문날짜 : 2018년 3월 12일
 * 주문자 이름 : 홍길순
 * 주문 상품 번호 : PD0345-12
 * 배송 주소 : 서울시 영등포구 여의도동 20번지
*/

package classpart;

public class Order {
	String orderNum;
	String orderID;
	String orderDate;
	String customerName;
	String productNum;
	String address;
	
	public String getOrderNum() {
		return orderNum;
	}
	
	public String getOrderID() {
		return orderID;
	}
	
	public String getOrderDate() {
		return orderDate;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public String getProductNum() {
		return productNum;
	}
	
	public String getAddress() {
		return address;
	}

}
