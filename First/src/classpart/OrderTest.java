package classpart;

public class OrderTest {
	public static void main(String[] args) {
		Order o1 = new Order();
		
		o1.orderNum = "201803120001";
		o1.orderID = "abc123";
		o1.orderDate = "2018년 3월 12일";
		o1.customerName = "홍길순";
		o1.productNum = "PD0345-12";
		o1.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println(o1.getOrderNum());
		System.out.println(o1.getOrderID());
		System.out.println(o1.getOrderDate());
		System.out.println(o1.getCustomerName());
		System.out.println(o1.getProductNum());
		System.out.println(o1.getAddress());
	}

}
